/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
//     public Treenode isNode(TreeNode root,TreeNode p,TreeNode q){
       
//     }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
        if(root==p||root==q||root==null)return root;
        
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null)return right;
        if(right==null)return left;
       
        return root;  
    }
}