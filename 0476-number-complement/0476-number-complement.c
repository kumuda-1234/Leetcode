int findComplement(int num) {
      unsigned int val=1;
        while(val<=num)
        {
            num=num^val;
            val=val<<1;

        }
        return num;
    
}