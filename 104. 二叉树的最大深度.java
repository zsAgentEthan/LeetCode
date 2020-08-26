/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // 二叉树最大高度：左子树和右子树最大高度 + 1
class Solution {
    public int maxDepth(TreeNode root) {
		// 叶子节点 返回0
		
		if (root == null) {
			return 0;
		} else {
			int leftHeight = maxDepth(root.left);
			int rightHeight = maxDepth(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
    }
}
