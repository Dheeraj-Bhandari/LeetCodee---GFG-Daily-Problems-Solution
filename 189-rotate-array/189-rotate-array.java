
class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        if(k==nums.length) return;
        if(k>nums.length){
            k = Math.abs(k%nums.length);
        }
        
        //Method 1
//          ArrayList<Integer> list = new ArrayList<>();
//         for(int i=nums.length-k; i<nums.length; i++){
//             list.add(nums[i]);
//         }
//         int m =nums.length-1;
//         for(int i = nums.length-k-1; i>=0; i--){
//             nums[m] = nums[i];
//             m--;
//         }
//         for(int i = 0; i<k; i++){
//             nums[i] = list.get(i);
            
//         }
//         return;
        
        
        // Method 2 optimal
        reverse(nums, 0, n-k-1);
        reverse (nums, n-k, n-1 );
        reverse (nums, 0 , n-1);
        return;
    }
    void reverse(int[] arr, int a , int b){
        while(a<b){
            int  temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;;
            a++;
            b--;
        }
    }
}