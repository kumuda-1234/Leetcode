class Solution {
    public String winningPlayer(int x, int y) {
        int ten=y/4;
        int count=0;
        while(x>0&&ten>0)
        {
            count++;
            x--;
            ten--;
        }
        if(count%2==0)
        return "Bob";
        return "Alice";

        


        
    }
}