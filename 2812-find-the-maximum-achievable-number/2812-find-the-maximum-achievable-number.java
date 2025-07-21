class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int i;
        int x=num;
        for(i=0;i<t;i++)
        {
           x--;
           num++; 

        }
        return num+t;
        
    }
}