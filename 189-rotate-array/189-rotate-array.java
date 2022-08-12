class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        if(k==nums.length) return;
        if(k>nums.length){
            k = Math.abs(k%nums.length);
        }
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