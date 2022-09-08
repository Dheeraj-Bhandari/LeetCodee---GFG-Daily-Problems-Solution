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
//     List<Integer> list  = new ArrayList<>();
    
//     public List<Integer> inorderTraversal(TreeNode root) {
//         if(root==null){
//             return list;
//         }
//         inorderTraversal(root.left);
//         list.add(root.val);
//         inorderTraversal(root.right);
//         return list;
        
//     }
// }

class Solution {
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> list  = new ArrayList<>();
        if(root==null) return list;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();  
       
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                   break; 
                } 
                node= stack.pop();
                list.add(node.val);
                node = node.right;

            }
            
        }
       
        
    return list;    
        
    }
}