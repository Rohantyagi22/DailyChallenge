class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        int left = 0;
        int k=s1.length();
        for(int i=0;i<s2.length();i++){
            s2Arr[s2.charAt(i)-'a']++;
            if(i-left+1>k){
                s2Arr[s2.charAt(left)-'a']--;
                left++;
            }
            if(isMatched(s1Arr,s2Arr)){
                return true;
            }
        }
        return false;
    }
    public boolean isMatched(int[] s1, int[] s2){
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}