/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {

     /**
     * 判断链表是否是回文结构
     * 1.放入数组中
     * 2.数组两端同时向中部靠近
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        ListNode cur = head;
        List<ListNode> list = new ArrayList<>();

        while(cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while(left < right) {

            if(list.get(left).val != list.get(right).val) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
