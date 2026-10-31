class Solution(object):
    def singleNonDuplicate(self, nums):
        if len(nums)==1:
            return nums[0]
        low = 0
        while(low<len(nums)):
            if low+1 < len(nums) and nums[low] == nums[low+1]:
                low = low+2
            else:
                return nums[low]
        
        return nums[low]        
       
      
        