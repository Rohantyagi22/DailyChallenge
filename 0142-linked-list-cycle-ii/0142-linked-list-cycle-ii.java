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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        boolean res = false;
        ListNode c1 = head;
        ListNode c2= head;
        while(c2.next!=null && c2.next.next!=null){
            c1=c1.next;
            c2=c2.next.next;
            if(c1==c2){
                res = true;
                break;
            }
        }
        if(res){
            c1=head;
            while(c1!=c2){
                c1=c1.next;
                c2=c2.next;
            }
            return c1;
        }
        return null;
    }
}