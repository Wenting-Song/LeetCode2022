class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{0,0,k,0});
        //store the No. of lives remaining & moves in our queue
        
        int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
        // int step = 0;
        int[][] life = new int[m][n];
        for (int[] row: life) Arrays.fill(row, k);
        int[][] visited = new int[m][n];
        for (int[] row: visited) Arrays.fill(row, -1);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] poll = q.poll();
                int lives = poll[2];
                int moves = poll[3];
                if(poll[0] == m-1 && poll[1] == n-1) return moves;
                for(int[] dir: dirs){
                    int newX = poll[0] + dir[0];
                    int newY = poll[1] + dir[1];
                    if(newX >= 0 && newX < m && newY >= 0 && newY < n && visited[newX][newY] < lives) {
                       if(grid[newX][newY] == 0){
                           visited[newX][newY] = lives;
                           q.add(new int[]{newX, newY, lives, moves+1}); 
                       }else if(lives > 0){
                           visited[newX][newY] = lives-1;
                           q.add(new int[]{newX, newY, lives-1, moves+1}); 
                           // life[newX][newY]--;
                       } 
                    }
                }
            }
        }
        return -1;
    }
}
