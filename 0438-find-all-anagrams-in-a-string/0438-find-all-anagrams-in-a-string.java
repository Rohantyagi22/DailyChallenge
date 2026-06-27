class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] sA = new int[26];
        int[] pA = new int[26];
        for(int i=0;i<p.length();i++){
            pA[p.charAt(i)-'a']++;
        }
        int left = 0;
        List<Integer> li = new ArrayList<>();
        for(int right=0;right<s.length();right++){
            sA[s.charAt(right)-'a']++;
            if(right>=p.length()){
                sA[s.charAt(left)-'a']--;
                left++;
            }
            if(isMatched(sA,pA)){
                li.add(left);
            }
        }
        return li;
    }
    public boolean isMatched(int[] sA,int[] pA){
        for(int i=0;i<sA.length;i++){
            if(sA[i]!=pA[i]){
                return false;
            }
        }
        return true;
    }
}