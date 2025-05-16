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
    int counter=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        pathsum(root,targetSum,(long)0);// start from root path calculate sum and check whether it equal to target
        pathSum(root.left,targetSum); //  and explore path from there left and right child thse are new paths 
        pathSum(root.right,targetSum);
        return counter;
    }
    void pathsum(TreeNode root , int target , long sum){
        // return if root is null
        if(root==null){
            return;
        }
        // add root value to the current sum
        sum+=root.val;
        // if it equal to target then increase the path count
        if(sum==target){
            counter++;
        }
        // like thise traverse there left and right child
        pathsum(root.left,target,sum);
        pathsum(root.right,target,sum);
    }
}