class Solution {
    public int[] closestPrimes(int left, int right) {
        if (left < 2) {
            left = 2; // Ensure left is at least 2
        }
        int[] primes =new int[right-left+1];
        int[] res={-1,-1};
        int i;
        int index=0;
        for(i=left;i<=right;i++)
        {
            if(isPrime(i))
            {
                primes[index]=i;
                index++;
            }

        }
        if(index<2)
        return res;
        int minDiff = Integer.MAX_VALUE;

        for (i = 0; i < index- 1; i++) 
        {
            int diff = primes[i + 1] - primes[i];

            if (diff < minDiff) 
            {
                minDiff = diff;
                res[0] = primes[i];
                res[1] = primes[i + 1];
            }
            if(diff==minDiff)
            {
                if (primes[i] < res[0])
                {
                    res[0] = primes[i];
                    res[1] = primes[i + 1];
                }
            }
        }
        return res;
    }
    boolean isPrime(int num)
    {
        int count=0;
        int i;
        for(i=2;i*i<=num;i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
}