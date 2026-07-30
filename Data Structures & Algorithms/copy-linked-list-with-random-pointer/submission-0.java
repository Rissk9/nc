/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
     public Node copyRandomList(Node head) {
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return new Node(head.val);
        }
        Node temp=head;
        int length=0;
        while (temp!=null) {
            length++;
            temp=temp.next;
        }
        Node[] orig=new Node[length+1];
        orig=arrayfy(head, orig);

        temp=head; 
        int[] random=new int[length];
        int i=0;
        while (temp!=null) {
            for(int j=0;j<orig.length;j++)
            {
                if (temp.random==orig[j]) 
                    random[i]=j;
            }

            i++;
            temp=temp.next;
        }

        Node dummy=new Node(-1);
        temp=head;
        Node t=dummy;
        while (temp!=null) {
            t.next=new Node(temp.val);
            t=t.next;
            temp=temp.next;
        }
        Node[] newCopy=new Node[length+1];
        newCopy=arrayfy(dummy.next, newCopy);

        temp=dummy.next;//which is the new copy head
        for(i=0;i<random.length;i++)
        {
            temp.random=newCopy[random[i]];
            temp=temp.next;
        }
        return dummy.next;
    }

    public Node[] arrayfy(Node head,Node[] arr){
        int i=0;
        while (head!=null) {
            arr[i]=head;
            head=head.next;
            i++;
        }
        arr[arr.length-1]=null;
        return arr;
    } 
}
