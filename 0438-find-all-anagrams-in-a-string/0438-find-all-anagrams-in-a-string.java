class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        int k = p.length();
        for(int i=0;i<p.length();i++){
            s1[p.charAt(i)-'a']++;
        }
        List<Integer> result = new ArrayList<>();
        int left = 0;
        for(int right = 0; right< s.length(); right++){
            s2[s.charAt(right)-'a']++;
            if(right-left+1>k){
                s2[s.charAt(left)-'a']--;
                left++;    
            }
            if(isMatched(s1,s2)){
                result.add(left);
            }
        }
        return result;
    }
    public boolean isMatched(int[] s1,int[] s2){
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}