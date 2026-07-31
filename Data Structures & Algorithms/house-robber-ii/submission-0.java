class Solution {
    public int rob(int[] nums) {
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);

        boolean[] visited=new boolean[nums.length];
        int ans1=maxcircle(0,nums,visited,dp);
        Arrays.fill(dp,-1);
        int ans2=maxcircle(1,nums,visited,dp);
        for(int i:dp)
        System.out.print(i+" ");
        return Math.max(ans1,ans2);

    }
    int maxcircle(int i,int[] a,boolean[] visited,int[] dp){
        if(i>=a.length)
        return 0;

        if(visited[i]==true||visited[(i+1)%a.length]==true){
            return 0;
        }
        if(dp[i]!=-1)
        return dp[i];

        visited[i]=true;
        dp[i]=Math.max(a[i]+maxcircle((i+2)%a.length,a,visited,dp),maxcircle((i+1)%a.length,a,visited,dp));
        visited[i]=false;
        return dp[i];
    }
}
