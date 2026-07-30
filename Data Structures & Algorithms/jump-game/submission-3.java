class Solution {
    public boolean canJump(int[] nums) {
        
        return explore(0,nums);
    }

    boolean greedy(int nums[]){
        int goal=nums.length-1;

        for(int i=1;i<=nums.length;i++){
            if(nums[goal-i]>=(i)) //i is because thats the index difference
            {
                goal=goal-i;
                i=1;
            }
            if(goal==0)
            return true;
        }
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
