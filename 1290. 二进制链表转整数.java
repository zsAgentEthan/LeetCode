/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode cur = head;
        List<ListNode> list = new ArrayList<>();

        while(cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        int highBit = list.size();
        int sum = 0;
        int i = 0;
        while(i < list.size() && highBit >= 0) {
            sum = (int) (sum + Math.pow(2,highBit - 1) * list.get(i).val);
            highBit--;
            i++;
        }
        return sum;
    }
}
