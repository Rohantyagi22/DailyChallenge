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
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left,root.right,1);
        return root;
    }
    public void dfs(TreeNode left,TreeNode right,int index){
        if(left == null || right == null){
            return;
        }
        if((index & 1) == 1){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        dfs(left.left,right.right,index+1);
        dfs(left.right,right.left,index+1);
    }
}