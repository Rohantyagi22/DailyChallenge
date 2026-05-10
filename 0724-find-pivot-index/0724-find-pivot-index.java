class Solution {
    public int pivotIndex(int[] nums) {
        int sl=0, sr=0;
        for(int i=0;i<nums.length;i++){
            sr+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sr = sr  - nums[i];
            if(sl == sr) return i;
            sl +=nums[i];
        }
        return -1;
    }
}