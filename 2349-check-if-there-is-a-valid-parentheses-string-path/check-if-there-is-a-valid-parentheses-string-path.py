class Solution:
    def hasValidPath(self, grid: list[list[str]]) -> bool:
        m = len(grid)
        n = len(grid[0])
        if (m+n-1)%2 ==1:
            return False
        if grid[0][0]==')':
            return False
        from functools import cache
        @cache    
        def dfs(r,c,balance):
            if grid[r][c] == '(':
                balance +=1
            else:
                balance -=1
            if balance<0:
                return False
            if r==m-1 and c == n-1 :
                return balance ==0
            if r+1<m and dfs(r+1,c,balance):
                return True
            if c+1<n and dfs(r,c+1,balance):
                return True
            return False
        return dfs(0,0,0)
