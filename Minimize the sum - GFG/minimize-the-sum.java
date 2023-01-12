//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        int sum = 0;
        Arrays.sort(arr);
      PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=N-1; i>=0; i--){
            pq.add(arr[i]);
        }
        
      
        while(pq.size()!=1){
            
           int num1 =pq.remove();
           int num2 =pq.remove();
           sum+=num1+num2;
            pq.add(num1+num2);
            
        }
        // System.out.println(pq);
        return sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends