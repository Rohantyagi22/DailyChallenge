class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        int min = 0;
        Queue<int[]> q = new LinkedList<>(); 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int[][] dir ={
            {1,0},{-1,0},{0,1},{0,-1}
        };
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] cell = q.poll();
                for(int[] d:dir){
                    int nrow = d[0]+cell[0];
                    int ncol = d[1]+cell[1];
                    if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol]==1){
                        grid[nrow][ncol] = 2;
                        fresh--;
                        q.offer(new int[]{nrow,ncol});
                    }
                }
            }
            if(!q.isEmpty()){
                min++;
            }
        }
        return fresh == 0 ? min:-1;
    }
}