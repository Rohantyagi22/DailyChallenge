class Solution {
    public String sortVowels(String s) {
        List<Character> vowel = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char c: s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                vowel.add(c);
            }
        }
        Collections.sort(vowel);
        int k=0;
        for(char c: s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                sb.append(vowel.get(k));
                k++;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}