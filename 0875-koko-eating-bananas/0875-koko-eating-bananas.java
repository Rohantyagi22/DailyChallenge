class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int pile:piles){
            max = Math.max(pile,max);
        }
        while(min<=max){
            int mid = min+(max-min)/2;
            if(valid(mid,h,piles)){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean valid(int value,int h,int[] piles){
        long count = 0;
        for(int i=0;i<piles.length;i++){
            count += (piles[i]+value-1)/value;
        }
        if(count<=h) return true;
        else return false;
    }
}