class Solution {
    public boolean canJump(int[] nums) {
        
        // return explore(0,nums);
        return greedy(nums);
    }

    boolean greedy(int nums[]){
       //check whether we can reach the goal from ith pos

        int goal=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){

            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        if(goal==0)
        return true;

        else
        return false;

    }
    boolean explore(int i,int [] nums){
        if(i==nums.length-1)
        return true;

        if(nums[i]==0)
        return false;

        if(nums.length-1-i<=nums[i])
        return true;

        boolean f=false;
        for(int j=1;j<=nums[i];j++){
            f=explore(i+j,nums);
            if(f)
            break;
        }

        return f;
    }
}
