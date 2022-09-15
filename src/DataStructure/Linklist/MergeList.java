package DataStructure.Linklist;

public class MergeList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode p1=list1, p2=list2, curr = dummy;
        while(p1!=null && p2!=null){
            if(p1.val>p2.val){
                curr.next=new ListNode(p2.val);
                p2= p2.next;
            }
            else if(p1.val<p2.val){
                curr.next=new ListNode(p1.val);
                p1= p1.next;
            }
            else {
                curr.next=new ListNode(p1.val);
                p1=p1.next;
            }
            curr=curr.next;
        }
        if(p1!=null){
            curr.next=p1;
        }
        if(p2!=null){
            curr.next=p2;
        }
        return dummy.next;
    }
}
