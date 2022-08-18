class Solution {
    public int minSetSize(int[] arr) {
        
        // Creating Map ans Stroing feq of each element;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            
        }
        
        // Stroing frq value in ArrayList then sorting it in Reverse order so max frq came at top
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        
        // Ruunig loop till len become <= the Half Size of Array. and finding max frq data in arraylist and subtracting its value in len Variable
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