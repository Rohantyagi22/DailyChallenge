class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 1;
        int max = 0;
        for(int weight: weights){
            min = Math.max(min,weight);
            max += weight;
        }
        while(min<=max){
            int mid = min + (max-min)/2;
            if(valid(mid,weights,days)){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean valid(int mid,int[] weights, int days){
        long count = 1;
        long sum = 0;
        for(int weight:weights){
            sum += weight;
            if(sum>mid){
                count++;
                sum = weight;
            }
        }
        return count<=days;
    }
}