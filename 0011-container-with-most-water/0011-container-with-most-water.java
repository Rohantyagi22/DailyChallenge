class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxSum = 0;
        int sum = 0;
        while(i<=j){
            if(height[i]<height[j]){
                sum = (j-i)*height[i];
                i++;
            }else{
                sum = (j-i)*height[j];
                j--;
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}