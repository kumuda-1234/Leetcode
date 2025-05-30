class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        for(String word: products){
            trie.insert(word);   
        }

        List<List<String>> suggestions = new ArrayList<>();
        for(int i=0; i<searchWord.length(); i++){
            suggestions.add(trie.match(searchWord.substring(0,i+1)));
        }

        return suggestions;
    }

    static class Node{
        Node chars[] = new Node[26];
        boolean isEnd = false;

        public boolean contains(char ch){
            return chars[ch - 'a'] != null;
        }
    }

    static class Trie{
        Node root;
        Trie(){
            root = new Node();
        }

        public void insert(String key){
            Node temp = root;
            for(char ch : key.toCharArray()){
                if(!temp.contains(ch)) temp.chars[ch - 'a'] = new Node();
                temp = temp.chars[ch - 'a'];
            }
            temp.isEnd = true;
        }

        public List<String> match(String key){
            Node temp = root;
            for(int i = 0; i < key.length(); i++){
                char ch = key.charAt(i);
                if(!temp.contains(ch)) return new ArrayList<>();
                temp = temp.chars[ch - 'a']; 
            }
            StringBuilder sb = new StringBuilder(key);
            return findAll(temp, sb, new ArrayList<>());
        }

        public List<String> findAll(Node temp, StringBuilder sb, List<String> list){
            if(list.size() == 3) return list;
            if(temp.isEnd) list.add(sb.toString());
            for(int i = 0; i < 26; i++){
                if(temp.chars[i] != null){
                    sb.append((char)(i + 'a'));
                    findAll(temp.chars[i], sb, list);
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return list;
        }
    }
}