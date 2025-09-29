class Solution {
    public int[] plusOne(int[] digits) { 

        int m=digits.length;
        int i;
        for(i=m-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
            digits[i]++;
            break;
            }
            if(digits[i]==9)
            digits[i]=0;
        }
        if(digits[0]==0)
        {
            int[] newarr=new int[m+1];
            newarr[0]=1;
            return newarr;
        }
        return digits;
        
        
        


        
    }
}
