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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
		if(root == null) {
			return result;
		}
    
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		TreeNode currentNode;
		int count;
		
		while(!queue.isEmpty()) {
	
			count = queue.size();
			List<Integer> oneLevel = new LinkedList<Integer>();

			while(count > 0) {
				
				currentNode = queue.poll();
				oneLevel.add(currentNode.val);
				count--;
				
				if(currentNode.left != null) {
				queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
				}
			result.addFirst(oneLevel);
			}
		return result;
		
    }
}
