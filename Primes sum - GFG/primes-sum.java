//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int N){
        // code here
        for(int i=1; i<=N; i++){
            if(checkPrime(i) && checkPrime(N-i)){
                // System.out.println(i);
                // System.out.println(N-i);
                return "Yes";
            }
        }
        return "No";
    }
    static boolean checkPrime(int n){
        if (n<=1 ) return false;
        if(n==2 || n==3 ) return true;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)return false;
        }
        return true;
    }
}