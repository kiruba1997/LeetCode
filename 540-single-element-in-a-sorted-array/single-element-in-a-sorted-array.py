class Solution(object):
    def singleNonDuplicate(self, nums):
        n = len(nums)
        if n==1:
            return nums[0]
        i=0
        while(i<n):
            if (i<n-1) and nums[i] == nums[i+1]:
                i=i+2
            else:
                return nums[i]
        return 0
        
        