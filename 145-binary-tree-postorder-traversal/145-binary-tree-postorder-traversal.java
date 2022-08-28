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

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack.push(root);
       while(!stack.isEmpty()){
           TreeNode node =stack.pop();
           stack2.push(node);
           if(node.left!=null) stack.push(node.left);
           if(node.right!=null) stack.push(node.right);
       }
        while(stack2.size()>0){
            list.add(stack2.pop().val);
        }
        return list;
    }
}