class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> notComm = new HashSet<>();
        for(int[] friendship : friendships){
            HashMap<Integer,Integer> map = new HashMap<>();
            boolean flag = false;
            for(int lan: languages[friendship[0]-1]){
                map.put(lan,1);
            }
            for(int lan: languages[friendship[1]-1]){
                if(map.containsKey(lan)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                notComm.add(friendship[0]-1);
                notComm.add(friendship[1]-1);
            }
        }
        int max_count = 0;
        int[] countArr = new int[n+1];
        for(int friend :notComm){
            for(int lan : languages[friend]){
                countArr[lan]++;
                max_count = Math.max(max_count,countArr[lan]);
            }
        }
        return notComm.size()-max_count;

        
    }
}