class Solution {
    public int[] replaceElements(int[] arr) {
        int max,i;
        max=-1;
        for(i=arr.length-1;i>=0;i--)
        {
            int curr=arr[i];
            arr[i]=max;
            max=Math.max(curr,max);
        }
        
        return arr;
        
    }
}