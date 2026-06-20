class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int i = end;
        while(start<=end){
            if(nums[start]*nums[start]<nums[end]*nums[end]){
                result[i] = nums[end]*nums[end];
                end--;
            }else{  
                result[i] = nums[start]*nums[start];
                start++;
            }
            i--;
        }
        return result;
    }
}