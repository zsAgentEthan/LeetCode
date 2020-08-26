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
    public boolean isBalanced(TreeNode root) {
      
		if(root == null) {
			return true;
		}else {
			return Math.abs(calHeight(root.left) - calHeight(root.right)) <= 1 
					&& isBalanced(root.left) && isBalanced(root.right);
		}
		
    
    }

    /**
	 * 计算以该节点为根节点树的高度
	 * @Description TODO
	 * @params @param root
	 * @params @return
	 * @return 以前节点为根节点树的高度
	 *
	 */
	private int calHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}else {
			int leftHeight = calHeight(root.left);
			int rightHeight = calHeight(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
}
