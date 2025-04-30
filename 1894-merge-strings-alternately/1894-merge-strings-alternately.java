class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i,j,k;
        i=0;
        j=0;
        k=0;
        int l1=word1.length();
        int l2=word2.length();
         StringBuilder result = new StringBuilder();
        while(i<l1 && j<l2)
        {
            if(k%2==0)
            {
               result.append(word1.charAt(i));
                i++;

            }
           else
          {
            result.append(word2.charAt(j));
            j++;
          }
          k++;
        }
        while(i<l1)
        {
            result.append(word1.charAt(i));
            i++;
            k++;
        }
        while(j<l2)
        {
           result.append(word2.charAt(j));
            j++;
            k++;
        }
        return result.toString();
    }
}