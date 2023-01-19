//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.checkFibonacci(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String checkFibonacci(int N){
        // code here
        if(perFectSquare(5*N*N+4) || perFectSquare(5*N*N-4) )return "Yes";
        else return "No";
       
    }
    
    static boolean perFectSquare(int n){
        int s =(int) Math.sqrt(n);
        return s*s==n;
    }
}
