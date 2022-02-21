/* https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer */
class Solution {
    public int getDecimalValue(ListNode head) {
        String s = "";
        while(head != null) {
            s += String.valueOf(head.val);
            head = head.next;
        }return Integer.parseInt(s,2);
    }
}
