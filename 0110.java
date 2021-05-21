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
public class Solution {
   public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left  - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}

class Solution {
   boolean res=true;
    public boolean isBalanced(TreeNode root) {
        getBalanced(root);
        return res;
    }
    public int  getBalanced(TreeNode root) {
         if(root==null||!res) return 0;
        int le=getBalanced(root.left);
        int ri=getBalanced(root.right);//获取左右子树高度
        if(Math.abs(le-ri)>1) 
            res=false;//不平衡
        return Math.max(le,ri)+1;
    }
}
