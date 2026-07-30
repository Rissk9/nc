class Solution {
    static ArrayList<Integer> dp=new ArrayList<>(31);
    static{
        for(int i=0;i<=50;i++)
            dp.add(-1);

        dp.set(0, 0);
        dp.set(1, 1);
        dp.set(2, 2);
        dp.set(3, 3);
    }
    public static int climbStairs(int n) {
         if(dp.get(n)!=-1)
            return dp.get(n);
        
        else{
            dp.set(n,climbStairs(n-1)+climbStairs(n-2));
            return dp.get(n);
        }

    }
}
