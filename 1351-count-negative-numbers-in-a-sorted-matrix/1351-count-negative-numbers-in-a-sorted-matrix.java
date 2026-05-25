class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        int row = m-1;
        int col = 0;
        int count = 0;
        while(row>=0 && col<n){
            if(grid[row][col]<0){
                count += (n-col);
                row--;
            }else{
                col++;
            }
        }
        return count;
    }
}