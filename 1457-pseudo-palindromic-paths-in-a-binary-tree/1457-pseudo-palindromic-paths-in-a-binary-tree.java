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
class Solution {
    
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root==null) return 0;
        
        helper(root);
        
        return count;
    }
    int count=0;
    int[] arr = new int[10];
    void helper(TreeNode root){
        if(root==null) return;
        
            arr[root.val]++;
        if(root.left==null &&  root.right==null){
            if(checkPalidrome(arr)){
                count++;
            }
        }
       
        helper(root.left);
        
        helper(root.right);
       arr[root.val]--;
        
    }
    
    boolean checkPalidrome(int[] arr){
        int maxOdd =0;
     for(int i=0; i<arr.length; i++){
         if(arr[i]!=0 &&  arr[i]%2==1){
             maxOdd++;
         }
     }
        return maxOdd<=1;
    }
}