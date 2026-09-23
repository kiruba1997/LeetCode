class Solution(object):
    def findMaxConsecutiveOnes(self, bags):
        count = max =  0 
        for ball in range(len(bags)):
            if bags[ball] == 1:
                count +=1
                if count>max:
                    max = count 
            else:
                count = 0
        return max

        