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
    int max=0;
    public  int diameterOfBinaryTree(TreeNode root) {
        
        // if(root==null)
        //     return 0;
        // diameterOfBinaryTree(root.left);
        // int leftHeight=heightOfBinaryTree(root.left);
        // int rightHeight=heightOfBinaryTree(root.right);
        // max=Math.max(max,leftHeight+rightHeight);
        // diameterOfBinaryTree(root.right);

        heightOfBinaryTree(root);
        return max;
        
        
    }
    public int heightOfBinaryTree(TreeNode head){
        if(head==null)
            return 0;

        int leftHeight=heightOfBinaryTree(head.left);
        int rightHeight=heightOfBinaryTree(head.right);
        
        max=Math.max(max,leftHeight+rightHeight);

        return 1+ Math.max(leftHeight,rightHeight);
    }
}
