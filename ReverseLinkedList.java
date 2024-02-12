class Solution {
    public ListNode reverseList(ListNode head) {
    //    if(head==null || head.next==null) return head;
    //    ListNode newHead=reverseList(head.next);
    //    head.next.next=head;
    //    head.next=null;
    //    return newHead;

    ListNode agla=null;
    ListNode prev=null;
    ListNode curr=head;

    while(curr!=null || agla!=null){
        agla=curr.next;
        curr.next=prev;
        prev=curr;
        curr=agla;
    }
    return prev;
    }
}
