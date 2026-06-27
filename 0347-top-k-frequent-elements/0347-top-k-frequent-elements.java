class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            pq.offer(ele);
        }
        int[] result = new int[k];
        int i = 0;
        while(k>0){
            Map.Entry<Integer,Integer> value = pq.poll();
            result[i] = value.getKey();
            k--;
            i++;
        }
        return result;
    }
}