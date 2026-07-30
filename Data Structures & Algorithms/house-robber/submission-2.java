class Solution {
    public int rob(int[] nums) {
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        // return calcMax(0,nums,dp);

        return spaceOptimised(nums,dp);
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

    int spaceOptimised(int nums[],int[] dp){

        //first understand what does the dp state mean- here its max from 0 to there

        //next understand whats the valid previous states can contibute to that

        // then write relation in for loop
        int ans=0;
        for(int i=0;i<nums.length;i++){

            int max=0;
            for(int j=i-2;j>=0;j--){
                if(dp[j]>max)
                max=dp[j];
            }
            dp[i]=nums[i]+max;
            
            if(dp[i]>ans)
            ans=dp[i];
        }
        // return Math.max(dp[dp.length-1],dp[dp.length-2]);
        return ans;
        
    }
}
