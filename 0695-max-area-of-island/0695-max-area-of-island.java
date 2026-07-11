class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int area = 0, maxArea = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    area = dfs(i,j,grid);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int row,int col,int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        int area = 1;
        area+=dfs(row+1,col,grid);
        area+=dfs(row-1,col,grid);
        area+=dfs(row,col+1,grid);
        area+=dfs(row,col-1,grid);
        return area;
    }
}