class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max = Integer.MIN_VALUE;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            sum = sum + nums[right];
            if(right-left+1 == k){
                max = Math.max(sum,max);
                sum = sum - nums[left];
                left++;
            }
        }
        return max/k;
    }
}