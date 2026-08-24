class Solution {
    public void reverseString(char[] s) {
       int i,j,len;
       len=s.length;
       char temp;
       for(i=0,j=len-1;i<j;i++,j--)
       {
         temp=s[i];
         s[i]=s[j];
         s[j]=temp;
       } 
       

        
    }
}