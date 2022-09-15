package DataStructure.Linklist;

public class MidLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    public ListNode Middle(ListNode head){
        ListNode[] list = new ListNode[20];
        int t=0;
        while(head!=null){
            list[t++]=head;
            head= head.next;
        }
        return list[t/2];
    }
}
