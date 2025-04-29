class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i,count5,count10,count20;
        count5=0;
        count10=0;
        count20=0;
        if(bills[0]==10||bills[0]==20)
        return false;
        if(bills[1]==20)
        return false;
        for(i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            count5++;
            else if(bills[i]==10)
            {
                count10++;
                if(count5!=0)
                count5--;
                else
                return false;
            }
            else if(bills[i]==20)
            {
                count20++;
                if(count10==0)
                {
                    if(count5<3)
                    return false;
                    else
                    count5=count5-3;
                }
                else
                {
                    if(count5!=0)
                    {
                        count5--;
                        count10--;
                    }
                    else
                    return false;
                }
            }
        }
        return true;
        
    }
}