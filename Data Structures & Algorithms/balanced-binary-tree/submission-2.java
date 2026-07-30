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
    public static boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }

        if (Math.abs(Height(root.left)-Height(root.right))>1) {
            return false;
        }
        boolean res=isBalanced(root.left);
        if(res==false) return false;
        res=isBalanced(root.right);
        if(res==false) return false;
        return true;
    }
    public static int Height(TreeNode root){
        if (root==null) 
            return 0;

        return Math.max(Height(root.left),Height(root.right))+1;
        
    }
}
