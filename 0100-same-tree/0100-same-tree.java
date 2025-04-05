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
    boolean ans = false ;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helperfn(p,q);
    }
    public boolean helperfn(TreeNode p, TreeNode q){
        
        if(p == null && q == null){
            return true ;
        }
        if(p == null ){
            return false;
        }
        if(q == null ){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        
        
        return helperfn(p.left , q.left) && helperfn(p.right,q.right);
    }
}