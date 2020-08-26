/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // 给定一个二叉树，检查它是否是镜像对称的。
class Solution {

    public boolean isSymmetric_Recursive(TreeNode root) {
        return checkMirror_Recursive(root, root);
    }
    
 /** 
	 *	递归实现（深度搜索）
	 * 	检查是否是镜像 两个树互为镜像：它们的两个根结点具有相同的值 每个树的右子树都与另一个树的左子树镜像对称
	 * @param treeA
	 * @param treeB
	 * @return
	 */
	private boolean checkMirror_Recursive(TreeNode rootA, TreeNode rootB) {

		if (rootA == null && rootB == null) {
			return true;
		}

		if (rootA == null || rootB == null) {
			return false;
		}

		return (rootA.val == rootB.val) 
				&& checkMirror_Recursive(rootA.left, rootB.right) 
				&& checkMirror_Recursive(rootA.right, rootB.left);
    }
    
 /**
	 *	迭代实现（广度搜索）
	 * @param root
	 * @return
	 */
	public boolean isSymmetric_Iter(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			TreeNode t1 = queue.poll();
			TreeNode t2 = queue.poll();
			
			if(t1 == null && t2 == null) {
				continue;
				}
			if (t1 == null || t2 == null) {
				return false;
			}
			if(t1.val != t2.val) {
				return false;
			}
			
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);
		}
		return true;
	}

    
}
