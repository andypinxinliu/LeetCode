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
    
    //to fidn the sum of all left leaves. I am using backtracking, recursion.

    //there are three conditions, first identity when a null root, then a special node
    //where it has a left leave, then iterate through the whole tree to find such node
    //in the second condition
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        if(null != root.left && null == root.left.left && null == root.left.right){
            return  root.left.val + sumOfLeftLeaves(root.right);
        }
        else
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
