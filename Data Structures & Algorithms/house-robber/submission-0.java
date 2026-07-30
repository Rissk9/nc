class Solution {
    public int rob(int[] nums) {
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);

        return calcMax(0,nums,dp);
    }

    int calcMax(int i,int[] a,int [] dp){

        if(i>=a.length)
        return 0;

        if(i==a.length-1)
        return a[a.length-1];

        if(dp[i]!=-1)
        return dp[i];

        return dp[i]=Math.max(a[i]+calcMax(i+2,a,dp),calcMax(i+1,a,dp));
    }
}
