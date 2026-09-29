class Solution(object):
    def firstUniqChar(self, s):
        d = {}
        for ch in s:
            d[ch] = d.get(ch,0)+1
        for i,ch in enumerate(s):
            if d[ch] == 1:
                return i
        return -1

        