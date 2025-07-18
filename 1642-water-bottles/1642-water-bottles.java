class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot=numBottles;

        while(numBottles>=numExchange)
        {
            int add=numBottles/numExchange;
            int rem=numBottles%numExchange;
            numBottles=rem+add;
            tot=tot+add;
        }
        return tot;
        
        
    }
}