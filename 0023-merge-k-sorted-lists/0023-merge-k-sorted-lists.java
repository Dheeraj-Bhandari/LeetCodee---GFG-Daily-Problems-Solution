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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode list : lists){
            
            while(list!=null){
                pq.add(list.val);
                list=  list.next;
            }
        }
        
        ListNode node = new ListNode(0);
       ListNode temp = node;
        
        while(pq.size()>0){
            ListNode newNode = new ListNode(pq.poll());
            temp.next = newNode;
            temp = temp.next;
            
        }
        return node.next;
    }
}