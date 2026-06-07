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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode largeDummy = new ListNode(-1);
        ListNode largeTail = largeDummy;
        ListNode smallTail = smallDummy;
        
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                smallTail.next = curr;
                smallTail = curr;
            }else{
                largeTail.next = curr;
                largeTail = curr;
            }
            curr = curr.next;
        }
        largeTail.next = null;
        smallTail.next = largeDummy.next;
        return smallDummy.next;
    }
}