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
    public TreeNode sortedArrayToBST(int[] nums) {
		return makeDfs(nums, 0, nums.length - 1);
    }

    /**
	 * 将有序数组转换为二叉搜索树(BST)
	 * BST:左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
	 * 	若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 
	 * 	它的左、右子树也分别为二叉排序树。
   *  将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
   *  本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
     */
    private TreeNode makeDfs(int[] nums, int left, int right) {
		
		if (left > right) {
			return null;
		}
		 // 总是选择中间位置左边的数字作为根节点
		int mid = (left + right) / 2;
		
		TreeNode root = new TreeNode(nums[mid]);
		root.left = makeDfs(nums, left, mid - 1);
		root.right = makeDfs(nums, mid + 1, right);
		
		return root;
	}
}
