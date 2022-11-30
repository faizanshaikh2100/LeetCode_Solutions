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
    public int getMax(TreeNode root){
        TreeNode temp=root;
         
        while(temp.right!=null){
           temp=temp.right;
        }
        int max=temp.val;
        
        return max;
    }
   public TreeNode deleteNode(TreeNode root, int key) {
       if(root==null)return null;
        if(root.val==key){
            //1.if root has 0 children
            if(root.left==null&&root.right==null)return null;

            //2.if root has only left children
            else if(root.right==null&&root.left!=null)return root.left;

            //3.if root has only right children
            else if(root.right!=null&&root.left==null)return root.right;
            
            int leftMax=getMax(root.left);
            root.val=leftMax;
            root.left=deleteNode(root.left,leftMax);
        } 
        else if(key<root.val)root.left=deleteNode(root.left,key);
        else root.right=deleteNode(root.right,key);       

        return root;
    }
}