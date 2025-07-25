
class Solution {
    public int passThePillow(int n, int time) {
         if (n == 1) 
            return 1;
        int cycleLength = 2 * (n - 1);
         int effectiveTime = time % cycleLength;
         if (effectiveTime < (n - 1)) 
            
            return 1 + effectiveTime;
         else 
         {
            int stepsBackward = effectiveTime - (n - 1);
            
            return n - stepsBackward;


         }
            
        
    }
}