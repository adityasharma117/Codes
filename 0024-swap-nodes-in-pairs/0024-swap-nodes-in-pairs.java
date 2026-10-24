/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){return null;}
        if(head.next==null){return head;}
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            ListNode nxt = curr.next.next;
            ListNode second = curr.next;
            second.next = curr;
            curr.next = nxt;
            prev.next = second;
        

        prev = curr;
        curr = nxt;
        }
    return dummy.next;
        
    }
}