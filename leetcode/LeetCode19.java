public class Main{c
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
     int length = 1;
     int loca = 0;
     ListNode node = dummy;
     ListNode node2 = head;
     while(node2.next!=null)
     {
        length++;
        node2 = node2.next;
     }
     loca = length - n;
     
     while(loca>0)
     {
      loca--;
      node = node.next;
     }
     node.next = node.next.next;
     return dummy.next;
    }

}