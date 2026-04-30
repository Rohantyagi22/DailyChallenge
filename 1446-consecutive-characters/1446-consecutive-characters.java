class Solution {
    public int maxPower(String s) {
        int maxCount = 1,count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count=1;
            }
        }
        return maxCount;
    }
}