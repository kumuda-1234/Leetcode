class Solution {
    public int smallestNumber(int n, int t) {
        int i,rem,pro;
        i=n;
        int temp=n;
        while(true)
        {
            pro=1;
            while(i!=0)
            {
                rem=i%10;
                pro=pro*rem;
                i=i/10;
            }
            if(pro%t==0)
            return temp;;
            temp++;
            i=temp;
        }
       
    }
}
