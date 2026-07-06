class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(visited,graph,source,destination);
    }
    public boolean dfs(boolean[] visited,List<List<Integer>> graph,int source,int destination){
        if(source == destination){
            return true;
        }
        visited[source] = true;
        for(int neigh: graph[source]){
            if(!visited[neigh]){
                dfs(visited,graph,neigh,destination);
            }
        }
        return false;
    }
}