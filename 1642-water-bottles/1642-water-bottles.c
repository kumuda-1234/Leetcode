int numWaterBottles(int numBottles, int numExchange) {
    
        int tot=numBottles;
        int add;
        int rem;

        while(numBottles>=numExchange)
        {
            add=numBottles/numExchange;
            rem=numBottles%numExchange;
            numBottles=rem+add;
            tot=tot+add;
        }
        return tot;
    
}