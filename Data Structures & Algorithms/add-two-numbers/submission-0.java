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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
     
        ListNode dummy=new ListNode(-1);
        ListNode dummyHead=dummy;
        while (l1!=null && l2!=null) {
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;
        }
        ListNode rem=null;
        if(l1!=null)
            rem=l1;
        else if(l2!=null)
            rem=l2;

        while (rem!=null) {
            int sum=rem.val+carry;
            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            rem=rem.next;
        }
        if (carry!=0) {
            dummy.next=new ListNode(carry);
        }
        return dummyHead.next;
    }
}
