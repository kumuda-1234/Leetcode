class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder ans=new StringBuilder();
        int l1=str1.length();
        int l2=str2.length();
        int l3=gcd(l1,l2);
        if((str1+str2).equals(str2+str1))
        {
           return str1.substring(0,l3);
        }
        return "";
    }
    public int gcd(int l1,int l2)
    {
        if(l2==0)
        return l1;
        return gcd(l2,l1%l2);
    }
}