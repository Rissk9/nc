/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null)
        return ans;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        level(queue);
        
        return ans;
        
    }
    void level(Queue<TreeNode> queue){
        
        while(!queue.isEmpty()){
            int size=queue.size();
            int count=0;
            for(int i=1;i<=size;i++){
                TreeNode temp=queue.poll();

                if(count==0){
                ans.add(temp.val);
                count++;
                }
                
                if(temp.right!=null)
                queue.offer(temp.right);

                if(temp.left!=null)
                queue.offer(temp.left);
            }
        }
    }
    
}
