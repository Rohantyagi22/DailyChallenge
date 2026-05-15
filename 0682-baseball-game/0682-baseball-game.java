class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
                sum += newScore;
            }else if(op.equals("D")){
                int newScore =(st.peek()*2);
                st.push(newScore);
                sum += newScore;
            }else if(op.equals("C")){
                sum -= st.pop();
            }else{
                int score = Integer.parseInt(op);
                st.push(score);
                sum += score;
            }
        }
        return sum;
    }
}