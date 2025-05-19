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
    public int maxLevelSum(TreeNode root) {
        int lev = 1;
        if(root == null)return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum =0;
            while(size>0){
                TreeNode  nn = queue.remove();
                sum = sum + nn.val;
                if(nn.left != null) queue.add(nn.left);
                if(nn.right != null) queue.add(nn.right);
                size--;
            }
            if(max < sum){
                max = sum;
                lev = level;
            }
            level++;
        }
        return lev;
    }
}