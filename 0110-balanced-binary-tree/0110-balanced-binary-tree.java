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
class Solution 
{
    private int dfsheight(TreeNode root) 
    {
        if (root == null) 
            return 0;
        int leftht = dfsheight(root.left);
        if (leftht == -1) 
            return -1;
        int rightht = dfsheight(root.right);
        if (rightht == -1) 
            return -1;
        if (Math.abs(leftht - rightht) > 1) 
        return -1;
    return 1 + Math.max(leftht, rightht);
    }
    public boolean isBalanced(TreeNode root) 
    {
        return dfsheight(root)!= -1;
    }

}