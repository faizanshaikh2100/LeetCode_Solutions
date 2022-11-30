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
    private int getMin(TreeNode root) {
                    TreeNode temp=root;
                    while(temp.left!=null)temp=temp.left;
                    return temp.val;

    }
    public TreeNode deleteNode(TreeNode root, int val) {
                 if(root==null)return null;
                 if(val<root.val)root.left=deleteNode(root.left,val);
                 else if(val>root.val) root.right=deleteNode(root.right,val);
                 else{
                     if(root.right==null)return root.left;
                     else if(root.left==null) return root.right;
                     else if(root.left==null&&root.right==null)
                         return null;
                     else {
                         int rightSuccesor = getMin(root.right);
                         root.val = rightSuccesor;
                         root.right = deleteNode(root.right, rightSuccesor);
                     }
                 }
                     return root;
    }
}