public class Main{c
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    int m  = n;
    if(m>0)
    {
        first = first.next;
    }
    while(first.next!=null)
    {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
     return dummy.next;
    }

}