
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){return null;}
        if(head.next == null){return head;}
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = head.next;
        
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = nex;
            nex = nex.next;
        }
        curr.next=prev;
        
        return curr;
    }
}