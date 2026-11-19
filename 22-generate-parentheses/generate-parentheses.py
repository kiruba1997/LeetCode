class Solution(object):
    def generateParenthesis(self, n):
        def backtrack(res,s,oc,cc):
            if len(s)==n*2:
                res.append(s)
                return 
            if oc<n:
                backtrack(res,s+"(",oc+1,cc)
            if cc<oc:
                backtrack(res,s+")",oc,cc+1)
        result = []
        backtrack(result,"",0,0)
        return result

        
        