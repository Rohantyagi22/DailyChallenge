class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] tree = new ArrayList[n];
        for(int i=0;i<n;i++){
            tree[i] = new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            if(manager[i]!=-1){
                tree[manager[i]].add(i);
            }
        }
        return dfs(headID,tree,informTime);
    }
    public int dfs(int emp,List<Integer>[] tree,int[] informTime){
        int max = 0;
        for(int child:tree[emp]){
            max = Math.max(max,dfs(child,tree,informTime));
        }
        return informTime[emp]+max;
    }
}