/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {

    // 迭代实现
    public ListNode deleteDuplicates_1(ListNode head) {

       ListNode pre = head;
       while(pre != null && pre.next != null) {
          if(pre.val == pre.next.val) {
            pre.next = pre.next.next;
              }else {
                pre = pre.next;
                }
                }
        return head;
    }
 }
    
    // 递归实现
    public ListNode deleteDuplicates_2(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        if (head.val == head.next.val) {
            head = deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
