class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int n=s.length();
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            count++;

        }
        int maxCount=count;
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(i-k)))
            count--;
            if(isVowel(s.charAt(i)))
            count++;
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
    public Boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        return false;
    }
}