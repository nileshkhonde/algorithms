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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        java.util.Queue q = new java.util.LinkedList();
        TreeNode special = new TreeNode(Integer.MIN_VALUE);
        q.offer(root);
        q.offer(special);
       
        int level = 0;
        while(!q.isEmpty()){
            TreeNode n = (TreeNode) q.poll();
            if(n != null){
                //System.out.println("val-"+n.val);
                if (n.val == Integer.MIN_VALUE){
                    level++;
                    if(!q.isEmpty()) {
                        q.offer(special);
                    }
                }else{
                    if(n.left != null){
                        q.offer(n.left);
                    }
                    if(n.right != null){
                         q.offer(n.right);
                    }

                }
            }
            
        }
        return level;
    }
}
