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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;

        int a=diameterOfBinaryTree(root.left)+diameterOfBinaryTree(root.right);
        int left=depthfinder(root.left);
        int right=depthfinder(root.right);
        max=(left+right)>max?(left+right):max;
        // System.out.println(max+"and root: "+root.data);
        
        return max;
        
    }
    int depthfinder(TreeNode root){
        if (root==null) {
            return 0;
        }

        return 1+Math.max(depthfinder(root.left),depthfinder(root.right));
    }
}
