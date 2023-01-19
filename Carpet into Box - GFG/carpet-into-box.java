//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int move = 0;
        int carlength = A;
        int carwidth = B;
        int Boxlength = C;
        int Boxwidth = D;
        
        while(Boxlength < carlength || Boxwidth <  carwidth){
            
            if(Boxlength < carlength){
              
                carlength= carlength/2;
            }
            else if(Boxwidth < carwidth){
                
                 carwidth= carwidth/2;
            }
            move++;
        }
        int prevMove = move ;
        move=  0;
        carlength = B;
         carwidth = A;
        
        
          while(Boxlength < carlength || Boxwidth <  carwidth){
          
            if(Boxlength < carlength){
                
                carlength= carlength/2;
            }
            else if(Boxwidth < carwidth){
               
                 carwidth= carwidth/2;
            }
            move++;
        }
        
        
        return Math.min(move, prevMove);
        
        // return prevMove;
    }
   
}
