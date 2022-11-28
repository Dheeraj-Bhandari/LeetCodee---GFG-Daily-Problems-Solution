//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        
        int max=0;
        int start=0;
        int end = -1;
        
        int i=0;
        int j=0;
        int sum=0;
        
        while(j<n){
            if(a[j]>=0){
                sum+=a[j];
                j++;
            }
            else{
                if(sum>max){
                    max=sum;
                    sum=0;
                     start=i;
                    end=j-1;
                   
                }
               
            
                    sum=0;
                    j++;
                    i=j;
                
                
            }
        }
           if(sum>max){
                    max=sum;
                    sum=0;
                     start=i;
                    end=j-1;
                   
                }
        
         ArrayList<Integer> ans = new  ArrayList<>();
         
         for(int k=start; k<=end;k++)ans.add(a[k]);
         
        //  System.out.println(max);
        if(ans.size()==0)ans.add(-1);
        return ans;
    }
}