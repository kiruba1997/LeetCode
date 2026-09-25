class Solution(object):
    def containsDuplicate(self, nums):
        # for i in range(len(nums)): #1 n 
        #     for j in range(i+1,len(nums)): # 2
        #         if nums[i] == nums[j]:
        #             return True       
        # else:
        #     return False
        # for i in nums:
        #     if nums.count(i)>1:
        #         return True
        # else:
        #     return False
        return not len(set(nums)) == len(nums)
        