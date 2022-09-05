/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            
            while(size-->0){
                Node head = q.poll();
                list.add(head.val);
                for(Node node:head.children){
                    q.offer(node);
                }
            }
            ans.add(list);
        }
        return ans;
        
        
    }
}