class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 1;
        int max = 0;
        for(int weight: weights){
            max += weight;
            min = Math.max(weight,min);
        }
        while(min<=max){
            int mid = min+(max-min)/2;
            if(valid(weights,mid,days)){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean valid(int[] weights,int load, int days){
        long count = 1;
        long sum = 0;
        for(int weight:weights){
            sum = sum + weight;
            if(sum>load){
                sum = weight;
                count++;
            }
        }
        return count<=days;
    }
}