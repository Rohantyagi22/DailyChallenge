class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int val = (s.charAt(i)-'a'+1);
            while(val>0){
               int rem = val%10;
               sum += rem;
               val = val/10;
            }
        }
        for(int j=1;j<k;j++){
            int totalSum=0;
            while(sum>0){
               int rem = sum%10;
               totalSum += rem;
               sum = sum/10;
            }
            sum = totalSum;  
        }
        return sum;
    }
}