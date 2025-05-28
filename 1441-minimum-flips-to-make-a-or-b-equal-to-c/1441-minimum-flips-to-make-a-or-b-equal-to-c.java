class Solution {
    public int minFlips(int a, int b, int c) {
        int flip=0;
        for(int i=1; i<=32; i++){
            int x=(a>>i)&1;
            int y=(b>>i)&1;
            int z=(c>>i)&1;
            if(z==0){
                flip+=(x+y);
            }
            else{
                if(x==0 && y==0){
                    flip+=1;
                }
            }
        }
        return flip;
    }
}