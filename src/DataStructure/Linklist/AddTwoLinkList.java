package DataStructure.Linklist;

import java.util.List;

public class AddTwoLinkList {

    public static void main(String[] args) {

        int value=18;
        int rem = value%10;
        int output= value/10;
        System.out.println(rem+" "+output);
        ListNode listNode = new ListNode(1,new ListNode(2,null));
        ListNode listNode1 = new ListNode(1,new ListNode(3,null));
        AddTwoLinkList addTwoLinkList= new AddTwoLinkList();
        addTwoLinkList.addTwoNumbers(listNode,listNode1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode listNode;
        while(l1!=null && l2!=null){
            int value=l1.val+l2.val;
            sum= value%10;
            carry=value/10;
          ListNode listNode1 = new ListNode(sum,null);

        }
       /* if(carry>0){
            list.next.val=carry;
            list.next=null;
        } */
        return null;
    }
}
