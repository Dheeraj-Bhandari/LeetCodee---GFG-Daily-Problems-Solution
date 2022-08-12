/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow= head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){ return null;}
            
            fast= fast.next.next;
            slow = slow.next;
        }
        
        
        while(head!=slow.next){
            
            slow= slow.next;
            head=head.next;
        }
        return head;
    }
}