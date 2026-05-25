class Solution {
    public int maximumCount(int[] nums) {
        int pos = nums.length - numberGreaterThan(nums,0);
        int neg = numberGreaterThanEqual(nums,0);
        return Math.max(pos,neg);
    }
    public int numberGreaterThan(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]<=target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public int numberGreaterThanEqual(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}