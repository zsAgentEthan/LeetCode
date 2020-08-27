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
    public boolean hasPathSum(TreeNode root, int sum) {
    	
    	if (root == null) {
    		return false;
    	}
    	
    	// 定义一个队列 存储当前节点
    	Queue<TreeNode> nodesQueue = new LinkedList<>();
    	Queue<Integer> sumQueue = new LinkedList<>();
    	nodesQueue.add(root);
    	sumQueue.add(root.val);
    	
    	while(!nodesQueue.isEmpty()) {
    		
    		TreeNode curNode = nodesQueue.poll();
    		int tempVal = sumQueue.poll();
    		
    		TreeNode leftNode = curNode.left;
    		TreeNode rightNode = curNode.right;
    		
    		if(leftNode == null && rightNode == null) {
    			if(tempVal == sum) {
    				return true;
    			}
    			continue;
    		}
    		
    		if(leftNode != null) {
    			nodesQueue.add(leftNode);
    			sumQueue.add(tempVal + leftNode.val);
    		}
    		if(rightNode != null) {
    			nodesQueue.add(rightNode);
    			sumQueue.add(tempVal + rightNode.val);
    		}
    	}
    	return false;
    }
    
     /**
     * 	给定一个二叉树和一个目标和
     * 	判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     * 	递归实现
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum_Recursive(TreeNode root, int sum) {
    	
    	if(root == null) {
    		return false;
    	}
    	if(root.right == null && root.left == null) {
    		return sum == root.val;
    	}    	
    	return hasPathSum_Recursive(root.left, sum - root.val) ||  hasPathSum_Recursive(root.right, sum - root.val);
    }
}
