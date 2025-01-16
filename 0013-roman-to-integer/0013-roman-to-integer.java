class Solution {
    public int romanToInt(String s) {
        char chars[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i,j;
        int ans=0;
        for(i=0,j=1;j<chars.length;i++,j++)
        {
            if(map.get(chars[i])>=map.get(chars[j]))
            ans=ans+map.get(chars[i]);
            else
            ans=ans-map.get(chars[i]);

        }
        ans=ans+map.get(chars[i]);
       return ans; 
    }
}