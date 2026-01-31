class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar=target-'0';
        for(int i=0;i<letters.length;i++)
        {
            int value=letters[i]-'0';
            if(value>tar)
            return letters[i];
        }
       return letters[0]; 
    }
}