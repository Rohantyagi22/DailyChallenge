/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode c1 = head;
        ListNode c2 = head;
        while(c2!=null){
            if(c2.next==null) return c1;
            if(c2.next.next==null) return c1.next;
            c1=c1.next;
            c2=c2.next.next;
        }
        return c1;
    }
}