class Solution {
    public int maxFreqSum(String s) {
        int maxvowel = 0;
        int maxconsonant = 0;
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            if(!Character.isLetter(c)) continue;

            int idx = c - 'a';
            freq[idx]++;

            if("aeiou".indexOf(c)!=-1){
                maxvowel = Math.max(maxvowel,freq[idx]);
            }else{
                maxconsonant = Math.max(maxconsonant,freq[idx]);
            }
        }
        return maxvowel+maxconsonant;
    }
}