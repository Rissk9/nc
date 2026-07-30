class Solution {

    List<Integer> curr=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        
        // HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            // set.add(nums[i]);
            curr.add(nums[i]);
            backtrack(nums);
            curr.remove(curr.size()-1);
            // set.remove(nums[i]);
        }
        return res;
    }
    void backtrack(int[] nums){

        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int j=0;j<nums.length;j++){

            if(curr.contains(nums[j]))
                continue;

            curr.add(nums[j]);
            backtrack(nums);

            curr.remove(curr.size()-1);
        }
    }
}
