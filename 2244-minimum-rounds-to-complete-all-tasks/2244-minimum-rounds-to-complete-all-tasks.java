class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count = 1;
        int ele = tasks[0];
        int ans = 0;
        for(int i=1; i<tasks.length; i++){
            
            if(tasks[i]!=ele ){
               while(count>1){
                   if(count>=3 && count-3!=1){
                       count-=3;
                       ans++;
                   }
                    else if(count>=2){
                       count-=2;
                       ans++;
                   }
               }
                if(count==1) return -1;
           
            
        }
             ele = tasks[i];
            count++;
       
    }
         while(count>1){
                   if(count>=3 && count-3!=1){
                       count-=3;
                       ans++;
                   }
                    else if(count>=2){
                       count-=2;
                       ans++;
                   }
               }
        if(count==1) return -1;
         return ans;
}
    
}