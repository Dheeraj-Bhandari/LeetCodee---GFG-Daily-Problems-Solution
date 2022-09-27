class Solution {
    public String pushDominoes(String dominoes) {
        int n =dominoes.length();
        char[] arr = new char[n+2];
        arr[0]= 'L';
        arr[arr.length-1]= 'R';
        
        for(int i=1; i<arr.length-1; i++){
            arr[i]= dominoes.charAt(i-1);
        }
        
        int j=0;
        int k=1;
        while(k<arr.length){
            while(arr[k]=='.'){
               k++; 
            } 
            if(k-j>1){
                 solveconfig(arr, j, k);
            
            }
           j=k;
            k++;
        }
        
        System.out.println(Arrays.toString(arr));
        // String res = "";
        // for(int i=1; i<arr.length-1; i++){
        //     res+=arr[i];
        // }
        
        StringBuilder res = new StringBuilder();
          for(int i=1; i<arr.length-1; i++){
            res.append(arr[i]);
        }
        return res.toString();
        
        
        
    }
    void solveconfig(char[] arr , int i , int j){
        if(arr[i]=='L' && arr[j]=='L'){
            for(int k=i+1; k<j; k++){
                arr[k] = 'L';
            }
        }
        else if(arr[i]=='R' && arr[j]=='R'){
             for(int k=i+1; k<j; k++){
                arr[k] = 'R';
            }
        }
         else if(arr[i]=='L' && arr[j]=='R'){
          
        }
         else {
             int half = (i+j)/2;
              if(((j-i))%2==1){
                    for(int k=i+1; k<=half; k++){
                  arr[k]='R';
              }
             for(int k=half+1; k<j; k++){
                  arr[k]='L';
              }
             
             }
             else{
                  for(int k=i+1; k<half; k++){
                  arr[k]='R';
              }
             for(int k=half+1; k<j; k++){
                  arr[k]='L';
              }
            
             }
        }
    }
}