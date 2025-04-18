 class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length*(long)width*(long)height;
        double val=Math.pow(10,4);
        double value=Math.pow(10,9);
        boolean a=(length>=val||width>=val||height>=val||mass>=val||vol>=value);
        boolean b=mass>=100;
       
        if(a&&b)
        return "Both";
        if(a&&!b)
        return "Bulky";
        if(b&&!a)
        return "Heavy";
         
        return "Neither";
       }
}


