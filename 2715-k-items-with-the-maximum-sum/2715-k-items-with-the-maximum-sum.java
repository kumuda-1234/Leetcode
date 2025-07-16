class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes)
         return k;
        if(k>numOnes)
        {
            if(k<=numZeros+numOnes)
            return numOnes;
            
        }
        int NegOnes=k-(numOnes+numZeros);
        int sum=numOnes-NegOnes;
         return sum;
        
            
                
            
    }
}