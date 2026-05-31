class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            System.out.println(mid);
            if(nums[mid]<k){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}