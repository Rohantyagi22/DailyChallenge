class Solution {
    public int pivotIndex(int[] nums) {
        int sl=0, sr=0;
        for(int i=0;i<nums.length;i++){
            sr+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print("i "+i);
            sr = sr  - nums[i];
            System.out.print(" sr "+sr);
            System.out.println(" sl "+sl);
            if(sl == sr) return i;
            sl +=nums[i];
        }
        return -1;
    }
}