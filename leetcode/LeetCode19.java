public class Main{
    public static void main(String[] args)
    {

    }
    class ListNode {
        int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
     int length = 1;
     int loca = 0;
     ListNode node = head;
     ListNode node2 = head;
     while(node2.next!=null)
     {
        length++;
        node2 = node2.next;
     }
     loca = length - n;
     int now = 0;
     while(node.next!=null)
     {
         if(now+1 == loca)
         {
            node.next = node.next.next;
            break;
         }else{
             now++;
             node = node.next;
         }
     }
     return node;





    }

}