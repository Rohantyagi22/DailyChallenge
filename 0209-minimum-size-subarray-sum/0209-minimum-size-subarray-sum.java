class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, len = 0, min = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right<nums.length;right++){
            sum += nums[right];
            while(sum>=target){
                len = right-left+1;
                min = Math.min(len,min);
                sum -= nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}