class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int min = 1;
        int max = 10000000;
        while(min<max){
            int mid = min+(max-min)/2;
            if(isValid(dist,mid,hour)){
                max=mid;
            }else{
                min = mid+1;
            }
        }
        return isValid(dist,min,hour)? min : -1;
    }
    public boolean isValid(int[] dist,int mid, double hour){
        double count = 0;
        for(int i=0;i<dist.length-1;i++){
           count = count + (dist[i]+mid-1)/mid;
        }
        count += (double)(dist[dist.length-1])/mid;

        return count<=hour;
    }
}