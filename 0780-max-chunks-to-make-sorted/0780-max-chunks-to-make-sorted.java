class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            s1.add(arr[i]);
            s2.add(i);
            if(s1.equals(s2))
            count++;
            
        }
       return count;
    }
}