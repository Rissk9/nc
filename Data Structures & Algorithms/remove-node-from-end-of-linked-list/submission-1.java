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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null) {
            return null;
        }
        ListNode Newhead=rev(head);
        if (n==1) {
            return rev(Newhead.next);
        }
        int count=1;
        ListNode temp=Newhead;
        while (count<n-1) {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        Newhead=rev(Newhead);
        return Newhead;
    }
    public static ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null) {
            ListNode after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
}
