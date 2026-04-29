import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum = 0, maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove duplicates
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            sum += nums[right];

            // Check window size
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // Slide window
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}