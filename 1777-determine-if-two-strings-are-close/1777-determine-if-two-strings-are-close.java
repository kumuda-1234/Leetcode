class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        HashMap<Character,Integer>mp1 = new HashMap<>();
         HashMap<Character,Integer>mp2 = new HashMap<>();
        if(m != n){
            return false;
        }
        for(int i=0;i<m;i++)
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            mp1.put(ch1,mp1.getOrDefault(ch1,0)+1);
            mp2.put(ch2,mp2.getOrDefault(ch2,0)+1);

        }
        for(char key:mp1.keySet()){
            if(!mp2.containsKey(key)){
                return false;
            }
        }

         List<Integer> freqList1 = new ArrayList<>(mp1.values());
        List<Integer> freqList2 = new ArrayList<>(mp2.values());

        Collections.sort(freqList1);
        Collections.sort(freqList2);

         return freqList1.equals(freqList2);

    }
}