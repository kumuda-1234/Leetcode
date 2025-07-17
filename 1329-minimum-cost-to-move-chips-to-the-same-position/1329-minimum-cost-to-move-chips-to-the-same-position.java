class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<n;i++)
        {
            if(position[i]%2==0)
            evenCount++;
            else
            oddCount++;
        }
        return Math.min(evenCount,oddCount);
        
    }
}