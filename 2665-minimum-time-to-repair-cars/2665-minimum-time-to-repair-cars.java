class Solution {
    public long repairCars(int[] ranks, int cars) {
         Arrays.sort(ranks);
        long left = 1, right =  (long) ranks[0] * (long) cars * (long) cars;  
        long result = right;
        
        while (left <= right) 
        {
            long mid = left + (right - left) / 2;
            if (canRepairInTime(ranks, cars, mid)) 
            {
                result = mid;
                right = mid - 1; 
            } 
            else 
            {
                left = mid + 1; 
            }
        }
        
        return result;
    }

    private boolean canRepairInTime(int[] ranks, int cars, long time)
    {
        long repairedCars = 0;
        for (int rank : ranks)
        {
            repairedCars += (long) Math.sqrt(time / rank); 
            if (repairedCars >= cars) return true; 
        }
        return repairedCars >= cars;
    

    }
}