class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        ArrayList<Integer> z=new ArrayList<>();
        for (int i: nums)
        {
            if (i<pivot)
                x.add(i);
            
            else if (i==pivot)
                y.add(i);
            
            else
                z.add(i);
            
        }
        int index=0;
        for (int i=0;i<x.size();i++)
        {
            nums[index]=x.get(i);
            index++;
        }
        for (int i=0;i<y.size();i++)
        {
            nums[index]=y.get(i);
            index++;
        }
        for (int i=0;i<z.size();i++)
        {
            nums[index]=z.get(i);
            index++;
        }
        return nums;
    }
}