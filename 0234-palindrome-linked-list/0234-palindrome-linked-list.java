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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode mid = midLL(head);
        ListNode temp = reverseLL(mid.next);
        while(temp!=null){
            if(temp.val!=head.val){
                return false;
            }
            temp = temp.next;
            head = head.next;
        }
        return true;
    }
    public ListNode midLL(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseLL(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}