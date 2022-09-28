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
       
        
        
        int size = 0;
        ListNode node = head;
        while(node!=null){
           
            node = node.next;
             size++;
        }
                                                            
                                                            
        //base case
        if(n==size){
           return head.next;
        }

        System.out.println(size);
        node = head;
        int target = size-n-1;
        System.out.println(target);
        while(target-->0){
            if(n==1 && node.next.next==null){
                node.next=null;
                return head;
            }
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}