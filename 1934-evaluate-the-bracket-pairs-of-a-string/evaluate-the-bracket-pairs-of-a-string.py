class Solution(object):
    def evaluate(self, s, knowledge):
        map = dict(knowledge)
        result = [] 
        i =0 
        while(i<len(s)):
            if s[i]=='(':
                i+=1
                key = []
                while(s[i]!=')'):
                    key.append(s[i])
                    i+=1
                key = "".join(key)
                result.append(map.get(key,'?'))
            else:
                result.append(s[i])
            i+=1
        return "".join(result)
        