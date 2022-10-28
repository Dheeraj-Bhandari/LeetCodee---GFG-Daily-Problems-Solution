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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    class Coordinate{
        int x, y;
        
        public Coordinate(int x, int y){
            this.x =x;
            this.y = y;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int x1 = KnightPos[0];
        int y1 = KnightPos[1];
        
        int x2 = TargetPos[0];
        int y2 = TargetPos[1];
        int[] dx = {-1,-2,-1,-2,1,2,1,2};
        int[] dy = {-2,-1,2,1,-2,-1,2,1};
        
        boolean[][] isVisited= new boolean [N+1][N+1];
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(x1, y1));
        isVisited[x1][y1]= true;
        
        int moveCount = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int count = 0; count<size; count++){
                Coordinate curPos= q.remove();
                
                if(curPos.x == x2 && curPos.y==y2)return moveCount;
                 for(int i=0; i<8; i++){
                if(isValid(curPos.x+dx[i], curPos.y+dy[i], N, isVisited)){
                    q.add(new Coordinate(curPos.x+dx[i], curPos.y+dy[i]));
                    isVisited[curPos.x+dx[i]] [curPos.y+dy[i]]=true;
                }
            }
            }
            
           
            moveCount++;
        }
        return -1;
        
        
    }
    
    public boolean isValid(int x, int y, int n,boolean[][] isVisited ){
        if(x<=0 || y<=0 || x>n || y>n || isVisited[x][y]==true)return false;
        
        return true;
    }
}