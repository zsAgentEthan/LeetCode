/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
 // 共有三种方式
 // 1.利用数组，返回数组的中间节点
public ListNode middleNode(ListNode head) {
   List<ListNode> list = new ArrayList<>();
   ListNode curr = head;

   while(curr != null) {
   list.add(curr);
   curr = curr.next;
   }
   return list.get(list.size() / 2);
   }
   
// 2.遍历两边链表，第一遍得到总数，第二遍遍历到N/2，返回值
    public ListNode middleNode_ByPoint(ListNode head) {

        ListNode curr = head;
        int N = 0;
        while(curr != null) {
            N++;
            curr = curr.next;
        }
        int k = 0;
        curr = head;
        while(k < N / 2) {
            k++;
            curr = curr.next;
        }
        return curr;
    }

 // 3.快慢指针法
 // 快指针一次走2步，慢指针一次走1步。当快指针遍历完时，慢指针刚好在中间处
 public ListNode middleNode_ByFastSlow(ListNode head) {
     ListNode slow = head, fast = head;
     while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
     return slow;
    }

 }
