class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for(int i=0;i<p.length();i++){
            pArr[p.charAt(i)-'a']++;
        }
        int left = 0;
        for(int right = 0; right<s.length();right++){
            sArr[s.charAt(right)-'a']++;
            if(right - left + 1 > p.length()){
                sArr[s.charAt(left)-'a']--;
                left++;
            }
            if(matched(sArr,pArr)){
                result.add(left);
            }
        }
        return result;
    }
    public boolean matched(int[] sArr,int[] pArr){
        for(int i=0;i<sArr.length;i++){
            if(sArr[i]!=pArr[i]){
                return false;
            }
        }
        return true;
    }
}