class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int ele: nums1)
        {
            set1.add(ele);
        }
        for(int ele :nums2)
        {
            set2.add(ele);
        }
        for(int ele:set1)
        {
            if(!set2.contains(ele))
            list1.add(ele);
        }
        for(int ele:set2)
        {
            if(!set1.contains(ele))
            list2.add(ele);
        }
        ans.add(list1);
        ans.add(list2);
        return ans;


        
    }
}