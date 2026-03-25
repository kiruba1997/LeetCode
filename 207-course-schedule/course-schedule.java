class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[1]).add(edge[0]);
        }
        int[] ind = new int[V];
        for(int i=0;i<V;i++){
            for(int n : adj.get(i)){
                ind[n]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count =0;
        ArrayList<Integer> res= new ArrayList<>();
        while(!q.isEmpty()){
            int vertex = q.poll();
            count++;
            res.add(vertex);
            for(int nei:adj.get(vertex)){
                ind[nei]--;
                if(ind[nei]==0){
                    q.add(nei);
                }
            }
        }
        return count==V;
    }
}