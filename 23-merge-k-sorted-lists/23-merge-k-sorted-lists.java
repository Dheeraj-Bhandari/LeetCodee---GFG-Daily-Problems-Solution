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
        PriorityQueue<Integer>  q = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list!=null){
                ListNode node = new ListNode(list.val);
                q.add(node.val);
               // System.out.println(list.val); 
                list=list.next;
            }
            
           
        }
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(q.size()>0){
            // ListNode qq = q.poll();
            ListNode node = new ListNode(q.poll());
            temp.next = node;
            temp = temp.next;
        }
        // System.out.println(q);
        return ans.next;
    }
}