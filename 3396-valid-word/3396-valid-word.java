class Solution {
    public boolean isValid(String word) {
        int len=word.length();
        int i;
        int v=0;
        int cn=0;
        if(len<3)
        return false;
         word = word.toLowerCase();
        for(i=0;i<len;i++)
    
        {
            char c=word.charAt(i);
            if(c>='a'&&c<='z')
            {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            v++;
            else
            cn++;
            }
            else if(c>='0'&&c<='9')
            {
                continue;
            }
            else
            return false;
        }
        return v>0&&cn>0;
    }
}