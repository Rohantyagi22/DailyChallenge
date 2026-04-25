class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j]==val){
                j++;
            }else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
        return i;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}