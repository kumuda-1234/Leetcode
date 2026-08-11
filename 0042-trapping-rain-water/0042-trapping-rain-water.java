class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int[] lMH = new int[n];
        int[] rMH = new int[n];
        //fill the lMH array 
        lMH[0] = height[0];
        for(int i=1; i<n;i++){
            lMH[i] = Math.max(lMH[i-1], height[i]);
        }
        //fill the rMH array
        rMH[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            rMH[j] = Math.max(rMH[j+1], height[j]);
        }
        //now find the water trapped 
        for(int k=0; k<n; k++){
            int water = Math.min(lMH[k],rMH[k])-height[k];
            if(water>0) maxWater += water;
        }
        return maxWater;
    }
}