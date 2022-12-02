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
    public boolean BST(TreeNode root,long low,long high) {
       if(root==null)return true;
       if(root.val<=low||root.val>=high)return false;
       return BST(root.left,low,root.val)&&BST(root.right,root.val,high);
    
    }
    public boolean isValidBST(TreeNode root){
        return BST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}