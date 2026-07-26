class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 0;
        int fresh = 0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
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
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                for(int[] d:dir){
                    int nrow = row+d[0];
                    int ncol = col+d[1];
                    if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1){
                        fresh--;
                        grid[nrow][ncol]=2;
                        q.offer(new int[]{nrow,ncol});
                    }
                }
            }
            if(!q.isEmpty()){
                count++;
            }
        }
        return fresh == 0 ? count:-1;
    }
}