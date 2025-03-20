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
        if(root.left == null && root.right==null ){
            ans =  true;
            return ans; 
        }
        
        int lefth = helperfn(root.left) + 1; 
        int righth = helperfn(root.right)+1;
        if(Math.abs(lefth-righth) > 1 ){
            return false ; 
        }
        
        
        
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public int helperfn(TreeNode Node){
        if(Node == null){
            return 0 ;
        }
        int left = helperfn(Node.left);
        int right = helperfn(Node.right);
        return 1 + Math.max(left , right);
    }
}