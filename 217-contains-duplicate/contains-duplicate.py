class Solution(object):
    def containsDuplicate(self, nums):
        # for i in range(len(nums)):
        #     # for j in range(i+1,len(nums)):
        #     #     if nums[i] == nums[j]:
        #     #         return True 
        #     if nums.count(nums[i])>1:
        #         return True
        # return False
        return len(nums) != len(set(nums))
