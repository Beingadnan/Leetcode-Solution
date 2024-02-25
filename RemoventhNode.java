public class RemoventhNode {
   
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp=new ListNode(0);
            temp.next=head;
          ListNode slow=temp;
          ListNode first=temp;
    
          for(int i=0;i<=n;i++){
              first=first.next;
          }
          while(first!=null){
               first=first.next;
              slow=slow.next;
             
          }
          
          slow.next=slow.next.next;
          return temp.next;
        }
   
}
