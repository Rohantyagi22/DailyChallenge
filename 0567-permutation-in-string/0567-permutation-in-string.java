class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        int left = 0;
        for(int right = 0; right<s2.length(); right++){
            s2Arr[s2.charAt(right)-'a']++;
            if(right-left+1>s1.length()){
                s2Arr[s2.charAt(left)-'a']--;
                left++;
            }
            if(matched(s1Arr,s2Arr)){
                return true;
            }
        }
        return false;
    }
    public boolean matched(int[] s1Arr,int[] s2Arr){
        for(int i=0;i<s1Arr.length;i++){
            if(s1Arr[i]!=s2Arr[i]){
                return false;
            }
        }
        return true;
    }
}