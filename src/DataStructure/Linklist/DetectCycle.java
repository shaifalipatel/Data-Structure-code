package DataStructure.Linklist;

import java.util.HashMap;
import java.util.List;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> hashMap = new HashMap<>();
        while(head!=null){
            if(hashMap.containsKey(head)){
                 return head;
            }
            if(!hashMap.containsValue(head))
            {
                hashMap.put(head,head.next);
            }
            head=head.next;
        }
        return  head;
    }
}
