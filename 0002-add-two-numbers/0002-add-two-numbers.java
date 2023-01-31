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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode newList = temp;
        while(l1!=null || l2!=null || carry!=0){
            int val1 = l1!=null ? l1.val : 0;
            int val2 = l2!=null ? l2.val : 0;
            
            int sum = val1+val2+carry;
            
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            newList.next = node;
            newList = newList.next;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2= l2.next;
        }
        return temp.next;
    }
}