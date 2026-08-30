class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        boolean[] visited = new boolean[n];
        for(int[] edge: edges){
            li.get(edge[0]).add(edge[1]);
            li.get(edge[1]).add(edge[0]);
        }
        return isValid(visited,li,source,destination);
    }
    public boolean isValid(boolean[] visited,List<List<Integer>> li,int source,int destination){
        if(source == destination) return true;
        visited[source] = true;
        for(int i: li.get(source)){
            if(!visited[i]){
                if(isValid(visited,li,i,destination))
                    return true;
            }
        }
        return false;
    } 
}