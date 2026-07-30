class Solution {
    List<Integer> curr=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        backtrack(0,nums);
        return res;
        
    }
    void backtrack(int i,int[] a){

        if(i==a.length){
            List<Integer> temp=new ArrayList<>(curr);
            Collections.sort(temp);
            if(!res.contains(temp)){
            res.add(new ArrayList<>(temp));
            }
            return;
        }


        System.out.print(i+" ");
        curr.add(a[i]);
        backtrack(i+1,a);

        curr.remove(curr.size()-1);
        backtrack(i+1,a);
    }
}
