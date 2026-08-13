class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        //create deque 
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            //check window size 
            if(!dq.isEmpty() && dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }
          //check max num
          while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])//since we are comparing nums not indexes
          {
              dq.pollLast();
          }
          dq.addLast(i);//we have to add indices in deque addlast-since last people will stay last
          //add the max num in the result array
          //i=k-1
          if(i>=k-1)
          res[i-(k-1)] = nums[dq.peekFirst()]; 
        }
        return res;
    }
}