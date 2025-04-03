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
    int max = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        helperfn(root);
        return max;
    }
    public int helperfn(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = helperfn(node.left);
        int right = helperfn(node.right);
        max = Math.max(max,left+right);
        return (1 + Math.max(left,right));
    }
}