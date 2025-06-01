class Trie {
    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(final String word) {
        TrieNode curr = root;

        for(final char c : word.toCharArray()) {
            final int idx = c - 'a';

            if(curr.children[idx] == null)
                curr.children[idx] = new TrieNode();
            
            curr = curr.children[idx];
        }

        curr.isWord = true;
    }
    
    public boolean search(final String word) {
        TrieNode curr = root;

        for(final char c : word.toCharArray()) {
            final int idx = c - 'a';

            if(curr.children[idx] == null)
                return false;
            
            curr = curr.children[idx];
        }

        return curr.isWord;
    }
    
    public boolean startsWith(final String prefix) {
        TrieNode curr = root;

        for(final char c : prefix.toCharArray()) {
            final int idx = c - 'a';

            if(curr.children[idx] == null)
                return false;
            
            curr = curr.children[idx];
        }

        return true;
    }

    private final class TrieNode {
        public final TrieNode[] children;
        public boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */