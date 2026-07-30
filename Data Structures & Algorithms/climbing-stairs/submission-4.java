class Solution {
    public static int climbStairs(int n) {
        
        int [] dp=new int[46];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        if(n<4)
            return dp[n];

        // int sum=0;
        for(int i=4;i<=n;i++)
            dp[i]+=dp[i-1]+dp[i-2];

        return dp[n];


    }
}
