class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Add all rotten oranges to queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } 
                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // Edge case: no fresh oranges
        if (fresh == 0) return 0;

        int minutes = 0;
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean infected = false;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();

                for (int[] d : dir) {
                    int r = curr[0] + d[0];
                    int c = curr[1] + d[1];

                    if (r >= 0 && c >= 0 && r < rows && c < cols 
                        && grid[r][c] == 1) {
                        
                        grid[r][c] = 2;
                        q.add(new int[]{r, c});
                        fresh--;
                        infected = true;
                    }
                }
            }

            if (infected) minutes++; // only count if spread happens
        }

        return fresh == 0 ? minutes : -1;
    }
}