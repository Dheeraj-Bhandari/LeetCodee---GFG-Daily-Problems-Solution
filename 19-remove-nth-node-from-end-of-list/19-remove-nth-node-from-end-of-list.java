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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //Base case;
        
      if(head.next==null){
                 head= null;
                return head;
            }
        
        // Finding Size of LL
        int size = 1;
        ListNode node = head;
        
        while(node.next!=null){
            node= node.next;
            size++;
        }
        
         int remove = size-n;
        node= head;
        if(remove==0) return head.next;
        for(int i=1; i<remove; i++){
            node = node.next;
        }
        node.next=node.next.next;
        return head;
     
    }
}