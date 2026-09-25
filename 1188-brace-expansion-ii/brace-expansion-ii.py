class Solution(object):
    def braceExpansionII(self, expression):
        n = len(expression)
        def parse(i):
            result = set()
            current = {""}
            while(i<n and expression[i]!='}'):
                if expression[i] == ',':
                    result |=current
                    current = {""}
                    i+=1
                elif expression[i] == '{':
                    sub, i = parse(i+1)
                    new_current = set()
                    for a in current:
                        for b in sub:
                            new_current.add(a+b)
                    current = new_current 
                else:
                    new_current = set()
                    for s in current:
                        new_current.add(s+expression[i])
                    current = new_current
                    i+=1
            result |=current 
            return result , i+1
        result , _ = parse(0)
        return sorted(result)
        