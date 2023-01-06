//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution
{
    int[] prime;
    Solution()
    {
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
        prime = new int[10000];
        Arrays.fill(prime, 1);
        prime[1]=0;
        for(int i=2; i<10000; i++){
            if(prime[i]==1){
                for(int j=i*i; j<10000; j+=i){
                    prime[j]=0;
                }
            }
        }
    }
    
    public int shortestPath(int Num1,int Num2){
        // Complete this function using prime array
        int ans[] =  new int[10000];
        Arrays.fill(ans,-1);
        boolean vis[] = new boolean[10000];
        Queue<Integer> q  = new LinkedList<>();
        q.add(Num1) ; vis[Num1] = false; ans[Num1]=0;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            if(vis[curr]) continue;
            vis[curr]=true;
            String str = ""+curr;
            
            for(int i=0; i<4; i++){
                for(char ch='0'; ch<='9'; ch++){
                    if(ch==str.charAt(i) || ch=='0' && i==0)continue;
                    String str2 = str.substring(0,i)+ch+str.substring(i+1);
                    int value = Integer.valueOf(str2);
                    if(prime[value]==1 && ans[value]==-1){
                        ans[value] = 1+ans[curr];
                        
                        q.add(value);
                    }
                }
            }
        }
        return ans[Num2];
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            System.out.println(ob.shortestPath(Num1,Num2));
        }
    }
}
// } Driver Code Ends