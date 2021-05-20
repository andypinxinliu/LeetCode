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
    
    //use BFS to find the shortestpath, if find a node with left and right both null, stop
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int curLevel = 1, nextLevel = 0;
        int depth = 1;
         
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            curLevel--;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                q.offer(node.left);
                nextLevel++;
            }
            if (node.right != null) {
                q.offer(node.right);
                nextLevel++;
            }
            
                    
        //the hardest is to determine when it will go to the next level, because each time
        // it is going to offer one node into the queue, and each time pop one node from
        // the queue, we can know when the current level is zero, which means for the previous
        //level, all nodes have already been poped out. Then we know we need to go to the next
        //level.
            if (curLevel == 0) {
                curLevel = nextLevel;
                nextLevel = 0;
                depth++;
            }
        }
        
        //this will return if and only if it is a perfect and a AVL tree, otherwise, it will
        //do the return at the top
        return depth;
    }
}
