class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i:nums1){
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        for(int i:nums2){
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }
        System.out.println(map1);
        System.out.println(map2);
        Set<Integer>  set = new HashSet<>();
        for(int i:nums1){
            if(map2.containsKey(i) && map1.containsKey(i) && !set.contains(i)){
                 if(map2.get(i)>=map1.get(i)){
                     int t = map1.get(i);
                while(t-->0){
                    ans.add(i);
                        }
                     set.add(i);
                  }
                else if(map1.get(i)>=map2.get(i)){
                    int t = map2.get(i);
                while(t-->0){
                    ans.add(i);
                    }
                    set.add(i);
                }
            }
          
            
            
        }
        int[] arr = new int[ans.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}