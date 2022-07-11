   package Linklist;

   public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
     this.val = val;
    }

    ListNode(int val, ListNode next) {
     this.val = val;
     this.next = next;
    }
   }

   /* public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode dummyHead = new ListNode(0);
     ListNode p = l1, q = l2, curr = dummyHead;
     int carry = 0;
     while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
     }
     if (carry > 0) {
      curr.next = new ListNode(carry);
     }*/
   class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode listNode = new ListNode(0);
     ListNode p1=l1, p2= l2, curr= listNode;
     int carry = 0;
     while (p1!= null || p2!= null){
       int x = p1!= null? p1.val:0;
       int y= p2!= null? p2.val:0;
       int sum= carry+x+y;
       carry = sum/10;
       curr.next = new ListNode(sum%10);
       curr = curr.next;
     }
     if(carry>0){
      curr.next = new ListNode(carry);
     }

     return curr;
    }

    public static void main(String[] args) {
     ListNode listNode = new ListNode();
     listNode.val = 10;
     listNode.next.val= 20;
     listNode.next.next.val= 30;
     ListNode n = listNode;
     while (n != null) {
      System.out.print(n.val + " ");
      n = n.next;
     }
    }
   }