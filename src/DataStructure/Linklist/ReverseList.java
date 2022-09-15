package DataStructure.Linklist;

public class ReverseList {

    //1->2->3->4->null

    public ListNode reverseList(ListNode head) {
        ListNode prev = null,next=null,curr=head;
        while(curr!=null){
            next=curr.next;//3-4
            curr.next=prev; //1-null
            prev=curr;//1
            curr=next;//2
        }
        return prev;
    }
    public ListNode reverseListRecursive(ListNode head){
        if (head == null|| head.next==null) {
            return head;
        }
        ListNode rest=reverseListRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return rest;
    }

}
