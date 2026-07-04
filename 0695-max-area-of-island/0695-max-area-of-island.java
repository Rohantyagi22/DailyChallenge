class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    maxArea = Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int row,int col){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1 || grid[row][col]==0){
            return 0;
        }
        grid[row][col] = 0;
        int area = 1;
        area+=dfs(grid,row-1,col);  //  left
        area+=dfs(grid,row+1,col);  //  right
        area+=dfs(grid,row,col-1);  //  up
        area+=dfs(grid,row,col+1);  //  down
        return area;
    }
}