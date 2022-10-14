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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode fast  =head;
        ListNode  slow = head;
        int size = 0;
        while(fast!=null){
            fast=fast.next;
            size++;
        }
        fast = head;
        while( fast.next!=null && fast.next.next!=null ){
            fast =fast.next.next;
            slow = slow.next;
            
        }
        if(head.next==null) return null;
        if(size%2==0){
           System.out.println(size);
            slow.next = slow.next.next;
            return head;
        }
        else{
            System.out.println(size);
            slow.val = slow.next.val;
            slow.next = slow.next.next;
            return head;
        }
     
    }
}