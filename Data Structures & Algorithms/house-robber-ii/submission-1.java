class Solution {
    public int rob(int[] nums) {
        
        // int[] dp=new int[nums.length];
        // Arrays.fill(dp,-1);

        // boolean[] visited=new boolean[nums.length];
        // int ans1=maxcircle(0,nums,visited,dp);
        // Arrays.fill(dp,-1);
        // int ans2=maxcircle(1,nums,visited,dp);
        // for(int i:dp)
        // System.out.print(i+" ");
        // return Math.max(ans1,ans2);
        //------------------------------------------------------another better way faster and the right way
        if(nums.length==1)return nums[0];
        int part1[]=new int[nums.length-1];
        int part2[]=new int[nums.length-1];

        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1)
            part1[i]=nums[i];

            if(i!=0)
            part2[i-1]=nums[i];
        }
        int[] dp=new int[nums.length-1];
        Arrays.fill(dp,-1);

        int maxpart1=maxRob(0,part1,dp);

        Arrays.fill(dp,-1);
        int maxpart2=maxRob(0,part2,dp);

        return Math.max(maxpart1,maxpart2);


    }
    int maxRob(int i,int[] nums,int[] dp){
        if(i>=nums.length)
        return 0;

        if(i==nums.length-1)
        return nums[nums.length-1];

        if(dp[i]!=-1)
        return dp[i];

        return dp[i]=Math.max(nums[i]+maxRob(i+2,nums,dp),maxRob(i+1,nums,dp));
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
