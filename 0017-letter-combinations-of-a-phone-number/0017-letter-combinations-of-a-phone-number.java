class Solution {
   private  String[] mappings= new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private  ArrayList<String> resuList= new ArrayList<String>();

    public  List<String> letterCombinations(String digits) {
        if (digits==null || digits.length()==0) {
            return new ArrayList<String>();
        }
        fuction(digits,new StringBuilder(),0);

        return resuList;
    }

     void fuction(String digits, StringBuilder letter, int index){
        if(index == digits.length()){
            resuList.add(letter.toString());
            return;
        }
        char charAt = digits.charAt(index);
        String s=mappings[charAt-'0'];

        for(int i=0; i<s.length();i++){
            letter.append(s.charAt(i));
            fuction(digits, letter, index+1);
            letter.deleteCharAt(letter.length()-1);
        }
    }
}