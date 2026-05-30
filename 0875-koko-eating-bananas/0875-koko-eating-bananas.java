class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int pile:piles){
            max = Math.max(pile,max);
        }
        while(min<=max){
            int mid = min + (max-min)/2;
            if(valid(piles,mid,h)){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public boolean valid(int[] piles,int mid,int h){
        long count = 0;
        for(int pile:piles){
            count = count + ((pile+mid-1)/mid);
        }
        return count<=h;
    }
}