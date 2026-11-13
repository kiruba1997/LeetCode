class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        def backtrack(oc,cc,s,res):
            if(len(s)==n*2):
                res.append(s)
                return 
            if(oc<n):
                backtrack(oc+1,cc,s+"(",res)
            if(cc<oc):
                backtrack(oc,cc+1,s+")",res)
    

        res = []
        backtrack(0,0,"",res)
        return res
    
        

        