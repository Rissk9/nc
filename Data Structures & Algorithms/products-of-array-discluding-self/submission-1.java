class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<a.length;i++)
            a[i]=nums[i];

        //first sweep
        a[0]=1;
        int product=1;
        for(int i=1;i<nums.length;i++){
            product*=nums[i-1];
            a[i]=product;
        }

        //second sweep reverse
        product=1;
        for(int i=a.length-2;i>=0;i--){
            product*=nums[i+1];
            a[i]=a[i]*product;
        }

        return a;
    }
}  
