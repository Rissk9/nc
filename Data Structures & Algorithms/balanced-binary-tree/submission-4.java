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
        if(Height(root)!=-1) return true;
        return false;
       
    }
    public static int Height(TreeNode root){
        
        // int result=res;
        
        if(root==null)
            return 0;

        if(root.left==null&&root.right==null){
            return 1;}
            
            
        int lheight=Height(root.left);
        int rheight=Height(root.right);
        if (lheight==-1 || rheight==-1) {
            return -1;
        }
        
        

        if (Math.abs(lheight-rheight)>1) {
            // result =-1;
            return -1;
        }
        return Math.max(rheight, lheight)+1;


    }
}
