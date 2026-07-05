class Solution {
    public int pivotIndex(int[] nums) {
        int sl = 0, sr = 0;
        for(int i=0;i<nums.length;i++){
            sl += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sl -= nums[i];
            if(sl == sr) return i;
            sr += nums[i];
        }
        return -1;
    }
}