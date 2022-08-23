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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return true;
     
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null ){
            slow= slow.next;
            fast= fast.next.next;
        }
      ListNode temp =  reverse(slow);
      while(temp!=null){
          if(head.val!=temp.val) return false;
          head= head.next;
          temp = temp.next;
      }  
    return true;
    
    }
  ListNode  reverse(ListNode slow){
        ListNode cur= slow;
        ListNode temp = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = temp;
            temp = cur;
            cur=next;
        }
        return temp;
    }
}