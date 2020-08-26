class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length];
        return mincost(days,costs,0,dp);
        
        
    }
    static int mincost(int days[],int costs[],int i,int dp[])
    {
        if(i>=days.length)
            return 0;
        if(dp[i]>0)
            return dp[i];
        int op1=mincost(days,costs,i+1,dp)+costs[0];
        int k=i;
        for(;k<days.length;k++)
        {
            if(days[k]>=days[i]+7)
                break;
        }
        int op2=mincost(days,costs,k,dp)+costs[1];
        for(;k<days.length;k++)
        {
            if(days[k]>=days[i]+30)
                break;
        }
        int op3=mincost(days,costs,k,dp)+costs[2];
        return dp[i]=Math.min(op1,Math.min(op2,op3));
    }
}