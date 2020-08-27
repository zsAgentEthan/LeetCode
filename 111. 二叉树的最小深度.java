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

    // 与最大深度相反，但要注意如果根节点的左或右子树为空的话是构不成子树的。
    // 而最小深度是要求从根节点到子树的。当左或右子树为空时，不符合要求。
    public int minDepth(TreeNode root) {
    
    	if (root == null) {
    		return 0;
    	}
    	// 左、右子树为空时是不参与比较的
    	if(root.left == null && root.right != null) {
    		int rightHeight = minDepth(root.right);
    		return rightHeight + 1;
    	}
    	
    	if(root.left != null && root.right == null) {
    		int leftHeight = minDepth(root.left);
    		return leftHeight + 1;
    	}
    		int leftHeight = minDepth(root.left);
    		int rightHeight = minDepth(root.right);
    		return Math.min(leftHeight, rightHeight) + 1;
    }
}
