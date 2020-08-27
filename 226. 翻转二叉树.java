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
    
    // 递归实现
    // 对各子树进行翻转，
    public TreeNode invertTree(TreeNode root) {
      	
    	if(root == null) {
    		return null;
    	}
    	
    	TreeNode leftNode = invertTree(root.left);
		  TreeNode righNode = invertTree(root.right);
      root.left = righNode;
      root.right = leftNode;

		return root;
    }
}
