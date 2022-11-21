class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r = maze.length, c = maze[0].length;
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        int sr = entrance[0], sc = entrance[1];
        maze[sr][sc] = '+';
        
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc, 0});
        
        while (!queue.isEmpty()) {
            int[] currState = queue.poll();
            int currRow = currState[0], currCol = currState[1], currDistance = currState[2];

            for (int[] dir : directions) {
                int nextRow = currRow + dir[0], nextCol = currCol + dir[1];

              
                if (0 <= nextRow && nextRow < r && 0 <= nextCol && nextCol < c
                   && maze[nextRow][nextCol] == '.') {
                    
                 
                    if (nextRow == 0 || nextRow == r - 1 || nextCol == 0 || nextCol == c - 1)
                        return currDistance + 1;
                    
                  
                    maze[nextRow][nextCol] = '+';
                    queue.offer(new int[]{nextRow, nextCol, currDistance + 1});
                }  
            }
        }

        return -1;
    }
}