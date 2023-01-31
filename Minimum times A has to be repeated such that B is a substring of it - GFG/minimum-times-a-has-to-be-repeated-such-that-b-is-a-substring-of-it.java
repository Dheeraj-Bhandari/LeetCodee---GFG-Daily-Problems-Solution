//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        if(A.contains(B))return 1;
        
        StringBuilder a = new StringBuilder(A);
    
        // System.out.println(a.length());
        
        int ans = 1;
        while((B.length()*2)>a.length()){
            a.append(A);
            ans++;
            if(a.toString().contains(B)){
                // System.out.println(a.toString());
                return ans;}
        }
            
        return -1;
    }
};