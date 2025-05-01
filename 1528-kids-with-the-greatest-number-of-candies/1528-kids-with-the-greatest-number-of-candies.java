class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int n=candies.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<n;i++)
        {
            if(candies[i]>max)
            max=candies[i];
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(res[i]>=max)
            ans.add(true);
            else
            ans.add(false);
        }
        return ans;
        
    }
}