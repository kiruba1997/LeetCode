class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        d = {}
        # for ele in s:
        #     d[ele] = d.get(ele,0)+1
        for i in range(len(s)):
            d[s[i]] = d.get(s[i],0)+1
        for ele in t:
            if ele not in d or d[ele] == 0:
                return False
            d[ele] -=1
        return True
        