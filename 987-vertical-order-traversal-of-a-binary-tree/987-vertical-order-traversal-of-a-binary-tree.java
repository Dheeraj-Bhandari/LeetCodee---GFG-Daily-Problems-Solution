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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
 if(root==null){
        return new ArrayList<>();
    }

    Map<Integer, Map<Integer, List<Integer>>> map=new TreeMap<>();

    Queue<Pair> q=new LinkedList<>();

    
    q.add(new Pair(root,0,0));
    while (!q.isEmpty()) {
        Pair temp = q.poll();

        TreeNode frontnode = temp.node;
        int lvl = temp.level;
        int h_dist = temp.hor_dist;

    
        if (!map.containsKey(h_dist)) {
            map.put(h_dist, new TreeMap<>());
        }
        if (!map.get(h_dist).containsKey(lvl)) {
            map.get(h_dist).put(lvl, new ArrayList<>());
        }
        map.get(h_dist).get(lvl).add(frontnode.val);

   
        if (frontnode.left != null) {
            q.add(new Pair(frontnode.left, h_dist - 1, lvl + 1));
        }
        if (frontnode.right != null) {
            q.add(new Pair(frontnode.right, h_dist + 1, lvl + 1));
        }
    }


    List<List<Integer>> ans=new ArrayList<>();
    for ( Map<Integer, List<Integer>> k: map.values()){
        List<Integer> sublist=new ArrayList<>();
        for (List<Integer> l : k.values()){
            Collections.sort(l);
            for(int item : l){
                sublist.add(item);

            }
        }
        
        ans.add(new ArrayList<>(sublist));
    }
    return ans;
}

class Pair{
    TreeNode node;
    int hor_dist;
    int level;

    public Pair(TreeNode node, int hor_dist, int level) {
        this.node = node;
        this.hor_dist = hor_dist;
        this.level = level;
    }
}
}