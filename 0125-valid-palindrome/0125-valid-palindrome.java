class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            char stCh = s.charAt(start);
            char endCh = s.charAt(end);
            if(Character.toLowerCase(stCh)!=Character.toLowerCase(endCh)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}