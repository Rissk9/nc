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
    public static boolean hasCycle(ListNode head) {
     ListNode slow=head;
     ListNode fast=head;
     if (head==null) {
            return false;
        }
     do{
         slow=slow.next;
         if(fast.next!=null)
             fast=fast.next.next;
         else
             return false;
     }while(slow!=null&&fast!=null&&(slow!=fast));
     if(slow==null||fast==null)
         return false;
     return true;
 }
}
