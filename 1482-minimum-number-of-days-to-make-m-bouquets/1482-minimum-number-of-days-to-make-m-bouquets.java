class Solution {
    private int Boquets(int[] bloomDay, int days,int m,int k)
    {
        int boq=0;
        int cnt=0;
        for(int i:bloomDay)
        {
            if(i<=days)
            {
                cnt++;
                
            }
            else
            {
                boq=boq+cnt/k;
                cnt=0;
            }
        }
        boq=boq+cnt/k;
        return boq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min=bloomDay[0];
        int max=bloomDay[0];
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++)
        {
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int low=min;
        int high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int boq=Boquets(bloomDay,mid,m,k);
            if(boq>=m)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}