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
    public boolean isSameTree(TreeNode root, TreeNode root2) {
       if(root==null&&root2==null){
		   return true;
	   }
		if((root==null&&root2!=null)||(root2==null&&root!=null)) return false;
	   if(root.val!=root2.val){
		   return false;
	   }

	   return isSameTree(root.left,root2.left)&&isSameTree(root.right,root2.right);
    }
}