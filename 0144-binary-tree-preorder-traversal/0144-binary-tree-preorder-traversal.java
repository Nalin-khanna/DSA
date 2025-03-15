/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        fn(root , l);
        return l;
    }
    public void fn(TreeNode root , List<Integer> l ){
        if(root==null ){
            return ;
        }
        l.add(root.val);
        fn( root.left , l );
        fn(root.right, l );
    }
}