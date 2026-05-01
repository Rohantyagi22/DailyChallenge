class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = nums.length+2, left = 0, sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum>=target){
                while(sum>=target){
                    sum = sum - nums[left];
                    
                    count = Math.min(count,i-left+1);
                    left++;
                }
            }
        }
        return count == nums.length+2 ? 0:count;
    }
}