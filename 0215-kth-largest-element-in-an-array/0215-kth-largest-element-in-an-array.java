class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a-b);
        for(int num:nums){
            pq.offer(num);
        }
        for(int i=0;i<nums.length-k;i++){
            pq.poll();
        }
        return pq.peek();
    }
}