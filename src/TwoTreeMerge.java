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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
         if(t1 == null && t2 == null){
             return null;
         }
        
        TreeNode n = new TreeNode();
        if(t1 != null){
             n.val = t1.val;
         }
         if(t2 != null){
             n.val += t2.val;
         }
        
            TreeNode t1Left = null;
         TreeNode t2Left = null;
         
         if(t1 != null){
             t1Left = t1.left;
         }
         if(t2 != null){
             t2Left = t2.left;
         }
         
         n.left = mergeTrees(t1Left, t2Left);
         
         TreeNode t1Right = null;
         TreeNode t2Right = null;
         
         if(t1 != null){
             t1Right = t1.right;
         }
         if(t2 != null){
             t2Right = t2.right;
         }
         n.right = mergeTrees(t1Right, t2Right);
        
        return n;
    }
    

}
