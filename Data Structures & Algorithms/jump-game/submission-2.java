class Solution {
    public boolean canJump(int[] nums) {
        
        return explore(0,nums);
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
