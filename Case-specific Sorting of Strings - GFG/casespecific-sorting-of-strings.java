//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
       
        int lc = 0;
        int uc = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                lc++;
            }
            else uc++;
        }
        
        char[] lower = new char[lc];
        char[] upper = new char[uc];
        
        int lcp= 0;
        int ucp = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[lcp] = ch;
                lcp++;
            }
            else {
             upper[ucp]=ch;
             ucp++;
            }
        }
        
        
        Arrays.sort(lower);
        Arrays.sort(upper);
        
        lcp=0;
        ucp =0;
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isUpperCase(ch)){
                ans.append(lower[lcp]);
                lcp++;
            }
            else {
                ans.append(upper[ucp]);
                ucp++;
            }
        }
        return ans.toString();
        
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends