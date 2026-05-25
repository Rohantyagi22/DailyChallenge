class Solution {
    public int countNegatives(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       int count = 0;
       for(int i=0;i<m;i++){
            count += negNo(grid,i);
       }
       return count;
    }
    public int negNo(int[][] grid,int row){
        int left = 0;
        int right = grid[0].length;
        while(left<right){
            int mid = (left+right)/2;
            if(grid[row][mid]>=0){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return grid[0].length-left;
    }
}