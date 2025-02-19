class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c1=coordinates.charAt(0);
        char s1=coordinates.charAt(1);
        if((s1+c1)%2==0)
        return false;
        else
        return true;
        
    }
}