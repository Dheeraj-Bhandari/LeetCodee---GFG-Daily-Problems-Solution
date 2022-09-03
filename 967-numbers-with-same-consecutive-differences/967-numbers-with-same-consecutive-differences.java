class Solution {
    public int[] numsSameConsecDiff(int n, int k) {

        // TLE Brute force Appoach
//         String s = "";
//         String e = "";
//         for(int i=0; i<n; i++){
//             e+="9";
//         }
//         for(int i=0; i<n; i++){
//             if(i==0)s+="1";
//             else s+="0";
//         }
//         int start = Integer.parseInt(s);
//         int end = Integer.parseInt(e);
//         List<Integer> list = new ArrayList<>();
//         for(int i=start; i<=end; i++){
//             int ans = countDigitDiffrence(i, k);
//             if(ans!=0){
//                 list.add(ans);
//             }
            
//         }
//         int[] ans = new int[list.size()];
//         for(int i=0; i<list.size(); i++){
//             ans[i]= list.get(i);
//         }
//         return ans;
//     }
    
//     int countDigitDiffrence(int n, int k){
//         String s =String.valueOf(n);
//         char[] ch = s.toCharArray();
//         for(int i=0; i<ch.length-1; i++){
//             if(Math.abs((ch[i]-'a')-(ch[i+1]-'a'))!=k)return 0;
            
//         }
//         return Integer.parseInt(s);
//     }
    List<Integer> list = new ArrayList<>();

        for(int i=1; i<=9;i++){
            countdigitsum(n,k, i, 0, i, list );
        }
        
         int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
    
   void countdigitsum(int n, int k, int cur, int i, int prev, List<Integer> list){
        if(i==n-1){
            list.add(cur);
            return;
        }
       int next = prev+k;
       if(next<10){
           countdigitsum(n,k, (cur*10)+next, i+1, next, list);
       }
       next = prev-k;
       if(k!=0 && next>=0){
            countdigitsum(n,k, (cur*10)+next, i+1, next, list);
       }
    }
    
}