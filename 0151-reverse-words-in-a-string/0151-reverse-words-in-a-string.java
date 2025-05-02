class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        int len=words.length;
        int i;
        StringBuilder revstr=new StringBuilder();
        for(i=len-1;i>=0;i--)
        {
            revstr.append(words[i]);
            if(i!=0)
            revstr.append(" ");
        }
     return revstr.toString().trim();
    }
}