class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        def recursion(open,close,s,res):
            if (n*2) == len(s):
                res.append(s)
                return 
            if open<n:
                recursion(open+1,close,s+"(",res)
            if close<open:
                recursion(open,close+1,s+")",res)

        res = [] 
        recursion(0,0,"",res)
        return res