/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//using Resursion

// class Solution {
//     List<Integer> list = new ArrayList<>();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         if(root==null) return list;
//         postorderTraversal(root.left);
//         postorderTraversal(root.right);
//         list.add(root.val);
//         return list;
//     }
// }

// using 2 Stack
// class Solution {
    
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         if(root==null) return list;
//         Stack<TreeNode> stack = new Stack<>();
//         Stack<TreeNode> stack2 = new Stack<>();
//         stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode node =stack.pop();
//            stack2.push(node);
//            if(node.left!=null) stack.push(node.left);
//            if(node.right!=null) stack.push(node.right);
//        }
//         while(stack2.size()>0){
//             list.add(stack2.pop().val);
//         }
//         return list;
//     }
// }

// using 1 Stack 

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
        
        while(root!=null ||!stack.isEmpty() ){
            if(root!=null){
                stack.push(root);
                root= root.left;
            }
           else{
            
            TreeNode temp =stack.peek().right;
           
            if(temp==null){
                temp = stack.peek();
                stack.pop();
                list.add(temp.val);
                
                while(!stack.isEmpty() && temp==stack.peek().right){
                    temp = stack.peek();
                    stack.pop();
                    list.add(temp.val);
                }
            }  
                else root = temp;
        }
    }
         return list;
    }
}