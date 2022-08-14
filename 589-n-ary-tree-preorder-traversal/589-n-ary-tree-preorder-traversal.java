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

// class Solution {
//     public List<Integer> preorder(Node root) {
//        if(root==null) return list;
//         pre(root);
//         return list;
       
//     }
//      List<Integer> list = new ArrayList<>();
//     void pre(Node root){
//         if(root==null) return;
//         list.add(root.val);
//         for(Node child:root.children){
//             pre(child);
//         }
//     }
// }

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node n = stack.pop();
            list.add(n.val);
            
            for(int i=n.children.size()-1; i>=0; i--){
                stack.push(n.children.get(i));
            }
            
        }
        return list;
       
    }
   
}