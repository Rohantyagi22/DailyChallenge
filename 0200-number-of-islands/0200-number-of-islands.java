class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int row,int col){
            //Boundary check
            if(row>=grid.length || col>=grid[0].length || row<0 || col<0 || grid[row][col]=='0'){
                return;
            }
            grid[row][col] = '0';
            dfs(grid,row-1,col); //up
            dfs(grid,row+1,col); //down
            dfs(grid,row,col-1); //left
            dfs(grid,row,col+1); //right
        }
}