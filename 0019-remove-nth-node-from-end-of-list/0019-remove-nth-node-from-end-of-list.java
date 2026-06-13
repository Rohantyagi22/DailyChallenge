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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null || head==null) return null;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode c1 = temp;
        for(int i=0;i<n;i++){
            c1=c1.next;
        }
        ListNode c2 = temp;
        while(c1.next!=null){
            c1 = c1.next;
            c2 = c2.next;
        }
        c2.next = c2.next.next;
        return temp.next;
    }
}