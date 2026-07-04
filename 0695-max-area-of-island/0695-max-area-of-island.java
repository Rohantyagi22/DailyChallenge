class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        Queue<int[]> q = new LinkedList<>();
        int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    int area = 0;
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;
                    while(!q.isEmpty()){
                        int[] cell = q.poll();
                        area++;
                        for(int[] dir:directions){
                            int nr = cell[0]+dir[0];
                            int nc = cell[1]+dir[1];
                            if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc]==1){
                                grid[nr][nc] = 0;
                                q.offer(new int[]{nr,nc});
                            }
                        }
                    }
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
}