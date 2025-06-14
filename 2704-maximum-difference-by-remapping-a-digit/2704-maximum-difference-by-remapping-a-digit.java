class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int i=0;
        while(i<str.length() && str.charAt(i)=='9') i++;
        int maxD;
        if(i==str.length()) maxD=9;
        else maxD=str.charAt(i)-48;
        int minD=str.charAt(0)-48;
        int min=0;
        int max=0,d,c=1;
        while(num>0){
            d=num%10;
            if(d==maxD){
                max+=c*9;
                min+=c*d;
            }
            if(d==minD){
                min+=c*0;
                max+=c*d;
            }
            else{
                min+=c*d;
                max+=c*d;
            }
            num/=10;
            c*=10;
        }
        return max-min;
    }
}