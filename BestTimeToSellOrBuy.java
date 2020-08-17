class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        return Helper(0,0,prices,2,hm);
        
    }
    static int Helper(int i,int buysell,int prices[],int k,HashMap<String,Integer> hm)
    {
        if(i>=prices.length || k==0)
            return 0;
        String key=i+"code"+buysell+"bix"+k;
        if(hm.containsKey(key))
            return hm.get(key);
        int x=0;
        if(buysell==0)
        {
            int buy=Helper(i+1,1,prices,k,hm)-prices[i];
            int nobuy=Helper(i+1,0,prices,k,hm);
            x=Math.max(buy,nobuy);
        }
        else
        {
            int sell=Helper(i+1,0,prices,k-1,hm)+prices[i];
            int nosell=Helper(i+1,1,prices,k,hm);
            x=Math.max(sell,nosell);
        }
        hm.put(key,x);
        return x;
    }
}