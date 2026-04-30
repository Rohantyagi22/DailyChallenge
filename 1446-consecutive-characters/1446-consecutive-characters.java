class Solution {
    public int maxPower(String s) {
        int count = 0,maxCount = 1;
        int i =1;
        while(i<s.length()){
            count = 1;
            while(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
                i++;
            }
            i++;
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}