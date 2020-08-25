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
    public boolean isSameTree_Deep(TreeNode p, TreeNode q) {
        
        // 利用深度优先搜索
       
        
    	TreeNode treeA = p;
    	TreeNode treeB = q;
    	
    	if (treeA == null && treeB == null) {
    		return true;
    	}else if (treeA == null || treeB == null) {
    		return false;
    	}else if (treeA.val != treeB.val) {
    		return false;
    	}else {
            return isSameTree_Deep(treeA.left, treeB.left) && isSameTree_Deep(treeA.right, treeB.right);
    	}
    }
    
    // 广度优先搜索
    public boolean isSameTree_Width(TreeNode p, TreeNode q) {
     
    	if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
    	
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        
        queue1.offer(p);
        queue2.offer(q);
        
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            
        	TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();

            if (node1.val != node2.val) {
                return false;
            }
            TreeNode left1 = node1.left, right1 = node1.right, left2 = node2.left, right2 = node2.right;
            if (left1 == null ^ left2 == null) {
                return false;
            }
            if (right1 == null ^ right2 == null) {
                return false;
            }
            if (left1 != null) {
                queue1.offer(left1);
            }
            if (right1 != null) {
                queue1.offer(right1);
            }
            if (left2 != null) {
                queue2.offer(left2);
            }
            if (right2 != null) {
                queue2.offer(right2);
            }
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }
    
    
}
