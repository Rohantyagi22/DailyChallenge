class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n = new HashSet<>();
        Set<Integer> arr = new HashSet<>();
        for(int num: nums1){
            n.add(num);
        }
        for(int num: nums2){
            if(n.contains(num)){
                arr.add(num);
            }
        }
        int[] ans = new int[arr.size()];
        int i=0;
        for(int num:arr){
            ans[i] = num;
            i++; 
        }
        return ans;

    }
}