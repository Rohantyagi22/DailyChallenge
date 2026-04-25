class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char startCh = s.charAt(i);
            char endCh = s.charAt(j);
            if(startCh!=endCh){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }    
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}