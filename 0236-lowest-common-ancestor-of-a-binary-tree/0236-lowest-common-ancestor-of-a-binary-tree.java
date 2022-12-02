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
    public boolean helper(TreeNode root,TreeNode key,ArrayList<TreeNode>list){
        if(root==null)return false;
        if(root==key){
            list.add(root);
            return true;
        }
        boolean result=helper(root.left,key,list)||helper(root.right,key,list);
        if(result==true)list.add(root);
        return result;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>list1=new ArrayList<>();
        helper(root,p,list1);
        ArrayList<TreeNode>list2=new ArrayList<>();
        helper(root,q,list2);
        
        int i=list1.size()-1;
        int j=list2.size()-1;
        TreeNode ans=null;
        while(i>=0&&j>=0){
            if(list1.get(i)==list2.get(j))ans=list1.get(i);
            else break;
            i--;
            j--;
        }
        return ans;
    }
}