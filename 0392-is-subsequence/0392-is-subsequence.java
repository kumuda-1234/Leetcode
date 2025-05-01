class Solution {
    public boolean isSubsequence(String s, String t) {
        int i,j;
        i=0;
        j=0;
        int l1=s.length();
        int l2=t.length();
        while(i<l1 && j<l2)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++; 
        }
       return i==l1; 
    }
}


