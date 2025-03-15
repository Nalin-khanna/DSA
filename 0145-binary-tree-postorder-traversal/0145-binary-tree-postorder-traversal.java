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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        fn(root , l);
        return l ; 
    }
    public void fn(TreeNode node , ArrayList<Integer> l ){
        if(node == null){
            return;
        }
        fn(node.left,l);
        fn(node.right ,l);
        l.add(node.val);
    }
}