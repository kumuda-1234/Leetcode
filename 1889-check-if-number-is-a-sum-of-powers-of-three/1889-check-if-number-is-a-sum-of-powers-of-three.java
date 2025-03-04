
class Solution {
    public boolean checkPowersOfThree(int n) {
        int exp=16;
        int[] arr=new int[exp];
        for(int i=0;i<exp;i++)
        {
            arr[i]=(int)Math.pow(3,i);
        }
        for(int i=exp-1;i>=0;i--)
        {
            if(n>=arr[i])
            n=n-arr[i];
            if(n==0)
              return true;
        }
        return false;
        
    }
}