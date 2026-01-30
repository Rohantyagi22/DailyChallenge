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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode c1 = head;
        ListNode c2 = head;
        while(c2.next!= null && c2.next.next!=null){
            c1=c1.next;
            c2=c2.next.next;
            if(c1==c2){
                return true;
            }
        }
        return false;
    }
}