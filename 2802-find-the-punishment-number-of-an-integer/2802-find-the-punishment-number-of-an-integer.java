class Solution {
    public int punishmentNumber(int n) {
        int num=0;
        int i;
        for(i=1;i<=n;i++)
        {
            int sq=i*i;
            if(partition(sq,i))
            num=num+sq;
        }
        return num;
    }
    boolean partition(int sq,int i)
    {
        if(sq<i||i<0)
        return false;
        if(sq==i)
        return true;
        return (partition(sq/10,i-(sq%10))||partition(sq/100,i-(sq%100))||partition(sq/1000,i-(sq%1000)));
    }
}