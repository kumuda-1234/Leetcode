class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int i=n-1;
        while(i>=0 && s.charAt(i)==' ' )
        i--;
        for(int j=i;j>=0 && s.charAt(j)!=' ';j--)
        {
            count++;

        }
        return count;
    }
}