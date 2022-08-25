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
    public TreeNode sortedArrayToBST(int[] nums) {
       
       TreeNode Node = sort(nums, 0, nums.length-1);
        return Node;
        
    }
    TreeNode sort(int[] nums, int s, int e ){
        if(s>e) return null;
        int mid = (s+e)/2;
        int data = nums[mid];
        TreeNode left = sort(nums, s, mid-1);
        TreeNode right = sort(nums, mid+1, e);
        TreeNode node = new TreeNode(nums[mid], left, right);
        return node;
    }
}