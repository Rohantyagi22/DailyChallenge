class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            li.get(edge[0]).add(edge[1]);
            li.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return valid(visited,li,source,destination);
    }
    public boolean valid(boolean[] visited,List<List<Integer>> li,int source,int destination){
        visited[source] = true;
        if(source == destination) return true;
        for(int i:li.get(source)){
            if(!visited[i]){
                 if(valid(visited,li,i,destination)){
                    return true;
                 }
            }
        }
        return false;
    }
}