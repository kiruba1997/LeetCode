class Solution(object):
    def bulbSwitch(self, n):
        return int(math.sqrt(n))
        # bulbs = [False] * n
        # for i in range(1,n+1):
        #     for j in range(i-1,n,i):
        #         bulbs[j] = not bulbs[j]
        #         # if bulbs[j]==True:
        #         #   bulbs[j] = False
        #         # else:
        #         #   bulbs[j] = True
        # count = 0
        # for i in bulbs:
        #     if i:
        #         count+=1
        # return count
        