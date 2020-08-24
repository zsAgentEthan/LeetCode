/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /**
  * 删除链表中的节点
  * 无法访问想要删除的节点之前的节点，
  * 我们将想要删除的节点的值替换为它后面节点中的值，然后删除它之后的节点。
  * @param node
  */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
