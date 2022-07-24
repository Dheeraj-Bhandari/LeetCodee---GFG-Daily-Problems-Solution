class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      
  
         return search(h, piles);
    }
    int search (int h,  int [] piles){
    List<Integer> ans = new ArrayList<>();
    int s=1;
   int e=Integer.MAX_VALUE;
        
    while(s<=e){
        int mid =s+(e-s)/2;
        if(check(mid,h,piles)==true){ 
            e=mid-1;
        }
        else{
            s=mid+1;
        }
       
    }
        return s;
       
    }
    boolean check(int mid, int h, int[] piles){
      
        int hr = 0;
        for(int b:piles){
            int rem = b / mid;
            hr+=rem;
            if(b%mid!=0) hr++;
        }
        return hr<=h;
}
}