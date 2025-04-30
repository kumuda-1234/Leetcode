
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i;
        int len=flowerbed.length;
        if(n==0)
        return true;
    for(i=0;i<len;i++)
    {
        if((i==0||flowerbed[i-1]==0)&&(flowerbed[i]==0)&&(i==len-1||flowerbed[i+1]==0))
        {
                flowerbed[i]=1;
                n--;
        }
            if(n==0)
            return true;

    }
        return false;
        
    }
}