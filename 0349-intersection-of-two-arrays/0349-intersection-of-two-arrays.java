class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int ele : nums1)
        {
            set1.add(ele);
        }
        for(int ele : nums2)
        {
            set2.add(ele);
        }
        set1.retainAll(set2);
        int[] arr=new int[set1.size()];
        int index=0;
        for(int ele: set1)
        {
            arr[index++]=ele;
        }
        return arr;
    }
}
