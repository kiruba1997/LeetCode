class Solution(object):
    def generateParenthesis(self, n):
        def backtrack(res,s,oc,cc):
            if (len(s)==n*2):
            # if (oc==n and cc==n):
                res.append(s)
                return 
            if(oc<n):
                backtrack(res,s+"(",oc+1,cc)
            if(cc<oc):
                backtrack(res,s+")",oc,cc+1)

        res = []
        backtrack(res,"",0,0)
        return res


        
        