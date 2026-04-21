class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        int p = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[k]*nums[k]<nums[p]*nums[p]){
                result[i] = nums[p]*nums[p];
                p--;
            }else{
                result[i] = nums[k]*nums[k];
                k++;
            }
        }
        return result;
    }
}