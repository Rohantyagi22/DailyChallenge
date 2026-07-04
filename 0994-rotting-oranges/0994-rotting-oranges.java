class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int[][] directions = {
                {1,0},{-1,0},{0,1},{0,-1}
            };
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                for(int[] dir:directions){
                    int nrow = dir[0]+row;
                    int ncol = dir[1]+col;
                    if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol]==1){
                        grid[nrow][ncol]=2;
                        fresh--;
                        q.offer(new int[]{nrow,ncol});
                    }
                }
            }
            if(!q.isEmpty()){
                minutes++;
            }
        }
        return fresh == 0 ? minutes: -1;
    }
}