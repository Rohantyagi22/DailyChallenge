class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
            System.out.println("sum:"+sum);
        }
        double maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            if(sum>maxSum){
                maxSum = sum;
                System.out.println("maxsum: "+maxSum);
            }
        }
        System.out.println("maxSum/k: "+maxSum/k);
        return maxSum/k;
    }
}