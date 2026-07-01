class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    count++;
                    queue.offer(new int[]{i,j});
                    grid[i][j] = '0';
                    while(!queue.isEmpty()){
                        int[] cell = queue.poll();
                        int row = cell[0];
                        int col = cell[1];
                        for(int[] dir: directions){
                            int newRow = dir[0]+row;
                            int newCol = dir[1]+col;
                            if(newRow>=0 && newCol>=0 && newRow<rows && newCol<cols && grid[newRow][newCol]=='1'){
                                queue.offer(new int[]{newRow,newCol});
                                grid[newRow][newCol]='0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}