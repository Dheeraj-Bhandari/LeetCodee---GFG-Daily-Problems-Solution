//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.NthTerm(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int NthTerm(int n)
    {
        // code here
        long ans = 1;
        int mod = 1000000007;
        for(int i=1; i<=n; i++){
            ans = ((ans*i)+1)%mod;
        }
        return (int)ans;
    }
}