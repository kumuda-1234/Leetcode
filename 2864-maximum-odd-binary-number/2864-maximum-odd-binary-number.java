class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len=s.length();
         char[] ans = new char[len];
        int cnt=0;
         for (char c : s.toCharArray()) 
         { 
            if (c == '1') 
               cnt++;
         }
            
        for(int i=0;i<len;i++)
        {
            if(i<cnt-1)
            ans[i]='1';
            else
            ans[i]='0';
        }
        ans[len-1]='1';
        return new String(ans);
        
    }
}