class Solution {
    public static int search(int[] nums, int target) {
     
        int low=0;
        int high=nums.length;

        while (low<=high && (low+high)/2<nums.length) {
            
            int mid=(high+low)/2;

            if(nums[mid]==target)
                return mid;

            else if(nums[mid]>target)
                high=mid-1;

            else
                low=mid+1;
        }
        return -1;
    }

}
