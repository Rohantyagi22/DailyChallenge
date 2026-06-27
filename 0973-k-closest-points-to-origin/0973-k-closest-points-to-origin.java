class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0] + b[1]*b[1]));
        for(int[] point : points){
            pq.offer(point);
        }
        int[][] result = new int[k][2];
        int i=0;
        while(k>0){
            int[] ele = pq.poll();
            result[i][0] =ele[0];
            result[i][1] =ele[1];
            k--;
            i++;        
        }
        return result;
    }
}