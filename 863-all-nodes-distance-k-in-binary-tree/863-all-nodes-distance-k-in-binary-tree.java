/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        find(root, target);
        for(int i=0; i<list.size(); i++){
           printkLevel(list.get(i),  i==0?null:list.get(i-1), k-i);
               
        }
        return ans;
    }
    ArrayList<TreeNode> list = new ArrayList<>();
    
    boolean find(TreeNode root, TreeNode target){
        if(root==null) return false;
        if(root==target){
            list.add(root);
            return true;
        }
        
        boolean a = find(root.left, target);
        if(a==true){
            list.add(root);
            return true;
        } 
        boolean b = find(root.right, target);
        if(b==true){
            list.add(root);
            return true;
        } 
        
        return false;
        
    }
    List<Integer> ans = new ArrayList<>();
    void printkLevel(TreeNode root, TreeNode blocker, int level){
        if(root==null || level<0 || root==blocker) return;
        if(level==0) ans.add(root.val);
        
        printkLevel(root.left, blocker, level-1);
        printkLevel(root.right, blocker, level-1);
        return;
    }
}