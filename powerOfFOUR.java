class Solution {
    public boolean isPowerOfFour(int num) {
       // if(num==2)
           // return true;
        int count=0;
    int x=num & (num-1);
        if(num>0 && x==0)
        {
            while(num>1)
            {
                count++;
                num=num>>1;
            }
            if(count%2==0)
                return true;
        }
        return false;
        
    }
}