class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[nums.length];
        int n = nums.length;
        Arrays.fill(result,-1);
        for(int i=2*n-1;i>=0;i--){
            int current = nums[i%n];
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    result[i] = st.peek();
                }
            }
            st.push(current);
        }
        return result;
    }
}