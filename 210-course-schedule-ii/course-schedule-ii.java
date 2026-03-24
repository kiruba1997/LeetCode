import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // Step 1: Build graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
        int[] indegree = new int[numCourses];
        
        for(int[] p : prerequisites) {
            int a = p[0];
            int b = p[1];
            
            adj.get(b).add(a);   // b → a
            indegree[a]++;
        }
        
        // Step 2: Queue
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }
        
        // Step 3: BFS
        int[] res = new int[numCourses];
        int index = 0;
        
        while(!q.isEmpty()) {
            int node = q.poll();
            res[index++] = node;
            
            for(int nei : adj.get(node)) {
                indegree[nei]--;
                if(indegree[nei] == 0) {
                    q.offer(nei);
                }
            }
        }
        
        // Step 4: Cycle check
        if(index != numCourses) {
            return new int[0]; // cycle exists
        }
        
        return res;
    }
}