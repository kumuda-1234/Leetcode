class Solution {
    public int passThePillow(int n, int time) {
        int count=0;
        int pos=1;
        int num=1;
        for(count=0;count<=time;count++)
        {
            if(num==n)
            pos=-1;
            if(num==1)
            pos=1;
            num=num+pos;

        }
        return num-pos;
    }
}