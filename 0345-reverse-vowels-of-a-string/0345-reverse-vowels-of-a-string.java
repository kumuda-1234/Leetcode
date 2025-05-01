class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int j;
        StringBuilder result = new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=-0;i<n;i++)
        {
            if(isVowel(s.charAt(i)))
             result.append(s.charAt(i));

        }
        int len=result.length();
        j=len-1;
        for(int i=0;i<n;i++)
        {
            
             if(isVowel(s.charAt(i)))
             {
                ans.append(result.charAt(j));
                j=j-1;
             }
             else
             ans.append(s.charAt(i));
             
        }

       return ans.toString(); 
    }
    Boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return true;
        return false;
    }

}