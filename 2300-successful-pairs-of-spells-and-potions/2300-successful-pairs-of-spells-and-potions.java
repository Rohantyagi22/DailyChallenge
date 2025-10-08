class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int k = potions.length;
        int[] ans = new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int spell = spells[i];            
            long minPotion = (success+spell-1)/spell;
            int idx = lowerbound(potions,minPotion);

            ans[i] = k - idx;
        }
        return ans;
    }
    private int lowerbound(int[] arr,long target){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<target) left = mid+1;
            else right = mid;
        }
        return left;
    }
}