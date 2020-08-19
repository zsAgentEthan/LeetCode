/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {

    // 快慢指针实现
    public boolean hasCycle_1(ListNode head) {

     if (head == null || head.next == null) {
         return false;
     }

     ListNode slow = head;
     ListNode fast = head.next;

     while(slow != fast) {

          if (fast == null || fast.next == null) {
            return false;
        }
         slow = slow.next;
         fast = fast.next.next;
     }
     return true;
    }
    
     // 利用哈希实现
    public boolean hasCycle_2(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while(head != null) {
            if(nodeSeen.contains(head)) {
                return true;
            } else {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
