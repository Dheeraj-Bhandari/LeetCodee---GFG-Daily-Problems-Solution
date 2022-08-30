class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
    // Using HashMap but giving TLE
//         Arrays.sort(nums);
//         HashMap<Integer, Integer> map = new HashMap<>();
//         List<Integer> list = new ArrayList<>();
//         Set<List<Integer>> set  = new HashSet<>();
        
//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//         }
        
//         for(int i=0; i<nums.length-2; i++){
//             map.put(nums[i], map.get(nums[i])-1);
//             for(int j =i+1; j<nums.length-1; j++){
//                 map.put(nums[j], map.get(nums[j])-1);
//                 int value = -(nums[i]+nums[j]);
//                 if(map.containsKey(value)){
//                     if(map.get(value)>0){
//                         list.add(value);
//                         list.add(nums[i]);
//                         list.add(nums[j]);
//                         Collections.sort(list);
//                         set.add(list);
//                         list = new ArrayList();
//                     }
//                 }
//                 map.put(nums[j], map.get(nums[j])+1);
//             }
//             map.put(nums[i], map.get(nums[i])+1);
//         }
//         return new ArrayList(set);
        
         // Using two pointer with set
        
//         Arrays.sort(nums);
//         Set<List<Integer>> set  = new HashSet<>();
//         for(int i=0; i<nums.length-2; i++){
//             int j=i+1;
//             int k = nums.length-1;
            
//             while(j<k){
//                 if(nums[j]+nums[k]+nums[i]==0){
//                     List<Integer>  list = new ArrayList<>();
//                     list.add(nums[i]);
//                     list.add(nums[j]);
//                     list.add(nums[k]);
//                     set.add(list);
//                     j++;
//                     k--;
//                 }
//                 else if(nums[j]+nums[k]+nums[i]>0){
//                     k--;
//                 }
//                 else j++;
//             }
            
//         }
//         return new ArrayList(set);
        
        //using two pointer without set
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int j=i+1;
                int k = nums.length-1;
                
                while(j<k){
                    int tgt = nums[i]+nums[j]+nums[k];
                    if(tgt==0){
                    List<Integer>  list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                   while(j<k && nums[j]==nums[j+1])j++;
                    while(j<k && nums[k]==nums[k-1])k--;
                        j++;
                        k--;
                    }
                    else if(tgt>0) k--;
                    else j++;
                }
            }
        }
            return ans;
    }
}