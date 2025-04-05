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
    int maxpath =  Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helperfn(root);
        return maxpath;
    }
    public int helperfn(TreeNode node){
        if(node == null ){
            return 0 ; 
        }
        int maxl = Math.max(0, helperfn(node.left));
        int maxr = Math.max(0, helperfn(node.right));

        maxpath = Math.max(maxpath , maxl+maxr + node.val);
      
        return Math.max(maxl , maxr) + node.val;
    }
}