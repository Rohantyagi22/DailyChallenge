class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        long product = 1;
        for(right = 0; right<nums.length; right++){
            product *= nums[right];
            while(product>=k && left<=right){
                product = product/nums[left];
                left++;
            }
            count += (right-left+1);
        }
        return count;
    }
}