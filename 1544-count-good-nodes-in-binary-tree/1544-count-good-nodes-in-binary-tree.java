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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        return getGoodValue(root , root.val);
    }

    int getGoodValue(TreeNode root, int maxValue){

        if(root == null) return 0;

        int val = 0;
        if(root.val >= maxValue){
            maxValue = root.val;
            val ++;
        }

        return getGoodValue(root.left , maxValue) + getGoodValue(root.right , maxValue) + val;
    }
}