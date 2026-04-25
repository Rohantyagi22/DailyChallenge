class Solution {
    public boolean isPalindrome(String s) {
        //Character.isDigit(char ch)
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            char startCH = s.charAt(i);
            char endCH = s.charAt(j);
            if(Character.toLowerCase(startCH)!=Character.toLowerCase(endCH)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}