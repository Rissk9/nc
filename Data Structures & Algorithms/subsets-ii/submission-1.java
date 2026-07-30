class Solution {
    List<Integer> curr=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        backtrack(0,nums);
        return res;
    }
    void backtrack(int i,int[] a){

        if(i==a.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(a[i]);
        backtrack(i+1,a);

        curr.remove(curr.size()-1);
        //now we need to skip all the upcoming occurences of the duplicate number to remove duplicate subset
        while(i+1<a.length && a[i]==a[i+1]){

            i++;
        }

        backtrack(i+1,a);
    }
}
