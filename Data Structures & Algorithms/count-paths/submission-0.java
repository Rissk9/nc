class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }

        // return pathsRecursion(m-1,n-1,dp);
        // return tabulationRec(dp);
        return spaceOptim(m,n);
    }
    int pathsRecursion(int i,int j,int[][] dp){
        if(i==0 && j==0)
        return 1;

        if(i<0 || j<0)
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        return dp[i][j]=pathsRecursion(i-1,j,dp)+pathsRecursion(i,j-1,dp);
    }
    int tabulationRec(int[][] dp){

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0)
                dp[0][0]=1;

                else{
                    int up=0;
                    int left=0;
                    if(i>0)
                    up=dp[i-1][j];
                    if(j>0)
                    left=dp[i][j-1];

                    dp[i][j]=up+left;
                }
                    
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    int spaceOptim(int m,int n){

        int prev[]=new int[n];
        
        for(int i=0;i<m;i++){
            int[] curr=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                curr[i]=1; //or else it will overwrite the base case to 0

                else{
                    int up=0;
                    int left=0;
                    if(i>0)
                    up=prev[j]; //goes up to the prev row

                    if(j>0)
                    left=curr[j-1]; //goes left to the col beside

                    curr[j]=up+left;
                    // System.out.println(curr[j]);
                }
            }
            //copy the curr array to the prev one 
            for(int k=0;k<curr.length;k++)
            {
                prev[k]=curr[k];
            }
        }
        return prev[n-1];
    }
}