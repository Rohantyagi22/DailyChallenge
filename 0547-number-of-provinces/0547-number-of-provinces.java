class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(visited,isConnected,i);
            }
        }
        return count;
    }
    public void dfs(boolean[] visited,int[][] isConnected,int node){
        visited[node] = true;
        for(int next=0;next<isConnected.length;next++){
            if(isConnected[node][next]==1 && !visited[next]){
                dfs(visited,isConnected,next);
            }
        }
    }
}