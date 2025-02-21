class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1=coordinate1.charAt(0);
        char s1=coordinate1.charAt(1);
        char c2=coordinate2.charAt(0);
        char s2=coordinate2.charAt(1);
        
        int a,b;
        if((c1+s1)%2==0)
        a=0;
        else
        a=1;
        if((c2+s2)%2==0)
        b=0;
        else
        b=1;
        if(a==b)
        return true;
        else
        return false;
    }
}
        
        