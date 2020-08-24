/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

    	// 哨兵节点
    	ListNode soldier = new ListNode(-1, head);
    	
    	// 双指针
    	ListNode pre = soldier;
    	ListNode cur = soldier.next;
    	
    	if(head == null) {
            return null;
            }
    	
    	while(cur != null) {
    		
    		if (cur.val == val) {
    			pre.next = cur.next;
    		}else {
    			pre = pre.next;
    		}
			cur = cur.next;
    	}
    	return soldier.next;    
    }
}
