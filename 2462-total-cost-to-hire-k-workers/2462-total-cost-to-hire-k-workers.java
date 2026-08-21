class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long res = 0;
        int i = 0; int j = n-1;
        while(k>0){
            while(pq1.size()<candidates && i<=j){
                pq1.offer(costs[i]);
                i++;
            }
            while(pq2.size()<candidates && j>=i){
                pq2.offer(costs[j]);
                j--;
            }
            int min1 = pq1.size()==0?Integer.MAX_VALUE:pq1.peek();
            int min2 = pq2.size()==0?Integer.MAX_VALUE:pq2.peek();
            if(min1<=min2){
                res += min1;
                pq1.poll();
            }else{
                res += min2;
                pq2.poll();
            }
            k--;
        }
        return res;
    }
}