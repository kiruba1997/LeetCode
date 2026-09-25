class Solution(object):
    def containsDuplicate(self, nums):
        return not len(set(nums)) == len(nums)

        # for ele in nums:
        #     if nums.count(ele)>1:
        #         return True
        # else:
        #     return False
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)):
        #         if (nums[i]==nums[j]):
        #             return True
        # else:
        #     return False
        