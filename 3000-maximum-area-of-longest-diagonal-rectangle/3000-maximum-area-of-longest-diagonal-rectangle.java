class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        double maxLength = 0; 
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            double diagonal_length = Math.sqrt((length*length) + (width*width));
            if(diagonal_length > maxLength){
                maxLength = diagonal_length;
                maxArea = length*width;
            }else if(diagonal_length == maxLength){
                maxArea = Math.max(maxArea,length*width);
            }
        }
        return maxArea;
    }
}