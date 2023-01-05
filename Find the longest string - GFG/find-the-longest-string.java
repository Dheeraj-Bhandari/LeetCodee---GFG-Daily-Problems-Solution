//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        Set<String> set = new HashSet<>();
        
        for(String str:arr)set.add(str);
        
        String ans ="";
        
        for(String str: arr){
            if(isPrefix(str, set)){
            if(str.length()>ans.length() ){
                ans = str;
            }
            else if(str.length()==ans.length()){
            if(str.compareTo(ans)<=0)ans = str;
            }
                
            }
        }
        // String a = "quw";
        // String b = "quf";
        // System.out.println(a.compareTo(b)>b.compareTo(a));
        return ans;
    }
    
    static boolean isPrefix(String str, Set<String> set){
                    String st = "";
                    for(int j=0; j<str.length(); j++){
                        st+=str.charAt(j);
                        if(!set.contains(st))return false;
                 }
                 return true;
                   
    }
}
        
