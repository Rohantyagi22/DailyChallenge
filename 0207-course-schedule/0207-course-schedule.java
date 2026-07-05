class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] state = new int[numCourses];
        for(int[] cell: prerequisites){
            graph.get(cell[1]).add(cell[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if(hasCycle(graph,state,i)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean hasCycle(List<List<Integer>> graph,int[] state,int cell){
        state[cell] = 1;

        for(int next: graph.get(cell)){
            if(state[next]==1){
                return true;
            }
            if(state[next]==0){
                if(hasCycle(graph,state,next)){
                    return true;
                }
            }
        }
        state[cell] = 2;
        return false;
    }
}