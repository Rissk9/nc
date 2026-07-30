class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(costcheck(0,cost,dp),costcheck(1,cost,dp));
        // return Math.(costcheck(0,cost,dp);
    }

    int costcheck(int i,int[] a,int[] dp){

        if(i>=a.length)
        return 0;

        if(i==a.length-1)
        return a[a.length-1];

        if(dp[i]!=-1)
        return dp[i];

        return dp[i]=a[i]+Math.min(costcheck(i+1,a,dp),costcheck(i+2,a,dp));
    }
}
