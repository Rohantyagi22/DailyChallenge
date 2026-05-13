class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                st.push(st.get(st.size()-1)+st.get(st.size()-2));
            }else if(operations[i].equals("D")){
                st.push(st.get(st.size()-1)*2);
            }else if(operations[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}