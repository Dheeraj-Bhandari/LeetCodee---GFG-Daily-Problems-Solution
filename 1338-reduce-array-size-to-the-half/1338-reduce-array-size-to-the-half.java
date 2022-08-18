class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
      


        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        
        int i =0;
        int ans =0;
        int len = arr.length;
        while(len>arr.length/2){
            len-=list.get(i);
            i++;
            ans++;
        }
        return ans;
    }
}