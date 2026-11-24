class Solution(object):
    def generateParenthesis(self, n):
        def backtrack(s,oc,cc,res):
            if len(s) == n*2:
                res.append(s)
                return 
            if oc<n:
                backtrack(s+"(",oc+1,cc,res)
            if cc<oc:
                backtrack(s+")",oc,cc+1,res)


        res = []
        backtrack("",0,0,res)
        return res
        
        