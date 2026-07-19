class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return validPath(visited,list,source,destination);
    }
    public boolean validPath(boolean[] visited,List<List<Integer>> list,int source,int destination){
        visited[source] = true;
        if(source == destination) return true;
        
        for(int node: list.get(source)){
            if(!visited[node]){
                if(validPath(visited,list,node,destination)){
                    return true;
                }
            }
        }
        return false;
    }
}