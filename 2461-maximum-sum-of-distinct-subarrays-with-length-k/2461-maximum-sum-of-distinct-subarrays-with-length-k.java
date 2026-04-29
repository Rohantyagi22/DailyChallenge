class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        long sum=0, maxSum = 0;
        for(int right = 0;right<nums.length;right++){
            //remove duplicates
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            //Add numbers from right
            set.add(nums[right]);
            sum+=nums[right];
          

            //check for sliding window
            if(right-left+1 == k){
                maxSum = Math.max(sum,maxSum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }

        }
        return maxSum;
    }
}