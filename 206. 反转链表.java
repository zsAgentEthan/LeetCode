/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    // 解决方式：1）双指针迭代 2）递归
    /**
     * 翻转链表（迭代）-在遍历列表时，将当前节点的 next 指针改为指向前一个元素
     * @param head
     * @return
     */
    public ListNode reverseList_Iter(ListNode head) {

    	ListNode pre = null;
    	ListNode cur = head;
    	
    	while(cur != null) {
    		
    		// 临时变量保存 下一个节点信息
    		ListNode tempNode = cur.next;
            
    		pre = cur;
    		cur = tempNode;
    	}
    	return pre;
    }
    
     /**
     * 翻转链表（递归）
     * @param head
     * @return
     */
    public ListNode reverseList_R(ListNode head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	
        ListNode p = reverseList_R(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
