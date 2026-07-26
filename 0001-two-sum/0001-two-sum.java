class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            if(map.containsKey(target-value)){
                return new int[]{i,map.get(target-value)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}