class Solution {
    public int findMiddleIndex(int[] nums) {
        int sl = 0, sr = 0;
        for(int i=0;i<nums.length;i++){
            sl += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sl -= nums[i];
            if(sr == sl) return i;
            sr += nums[i];
        }
        return -1;
    }
}