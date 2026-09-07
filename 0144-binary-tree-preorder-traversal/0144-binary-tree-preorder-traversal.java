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
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        //As we need to go in root,left,right order let us add root val in the res
        if(root==null)
        return res;
        res.add(root.val);
        //Left traversal
        preorderTraversal(root.left);
        //Right traversal
        preorderTraversal(root.right);
        return res;

        
    }
}