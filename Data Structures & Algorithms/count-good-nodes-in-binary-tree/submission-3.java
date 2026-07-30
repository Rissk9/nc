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
    int count=0;
    public int goodNodes(TreeNode root) {
        
        maxonpath(root,Integer.MIN_VALUE);
        return count;
    }
    void maxonpath(TreeNode node, int max){

        

        if(node.val>=max){
            count++;
            max=node.val;
        }
        if(node.left!=null)
        maxonpath(node.left,max);

        if(node.right!=null)
        maxonpath(node.right,max);
    }
}
