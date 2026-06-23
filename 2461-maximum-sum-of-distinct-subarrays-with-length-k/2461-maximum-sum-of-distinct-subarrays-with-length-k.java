class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        long max = 0, sum = 0;
        for(int right = 0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            if(right-left+1==k){
                max = Math.max(sum,max);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return max;
    }
}