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
        ListNode mid = middleLL(head);
        ListNode temp = mid.next;
        ListNode kaka = reverseLL(temp);
        while(kaka!=null){
            if(kaka.val != head.val){
                return false;
            }
            kaka = kaka.next;
            head = head.next;
        }
        return true;
    }
    public ListNode middleLL(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
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