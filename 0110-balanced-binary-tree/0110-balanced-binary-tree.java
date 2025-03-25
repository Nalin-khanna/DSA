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
    public boolean isBalanced(TreeNode root) {
        boolean ans = false;
        if(root==null){
            return true;
        }
        int val = helperfn(root);
        if(val == -1){
            return false ; 
        }
        else{
            return true ;
        }
    }
    public int helperfn(TreeNode Node){
        if(Node == null){
            return 0 ;
        }
        int left = helperfn(Node.left);
        int right = helperfn(Node.right);
        if (left == -1 || right == -1 ){
            return -1; 
        }
        if(Math.abs(left-right )> 1){
            return -1;
        }
        return 1 + Math.max(left , right);
    }
}