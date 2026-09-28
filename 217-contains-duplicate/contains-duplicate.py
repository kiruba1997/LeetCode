class Solution(object):
    def containsDuplicate(self, nums):
        return not len(set(nums)) == len(nums)
        # n = len(nums)
        # for i in range(n):
        #     for j in range(i+1,n):
        #         if nums[i] == nums[j]:
        #             return True
        # return False
        # for ele in nums:
        #     if nums.count(ele)>1:
        #         return True
        # return False

        