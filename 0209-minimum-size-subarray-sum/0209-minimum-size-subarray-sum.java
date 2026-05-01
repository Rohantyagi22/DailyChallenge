class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE, left = 0, sum = 0;
        for(int right=0;right<nums.length;right++){
            sum = sum + nums[right];
            if(sum>=target){
                while(sum>=target){
                    minLen = Math.min(minLen,right-left+1);
                    sum = sum - nums[left++];
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0:minLen;
    }
}