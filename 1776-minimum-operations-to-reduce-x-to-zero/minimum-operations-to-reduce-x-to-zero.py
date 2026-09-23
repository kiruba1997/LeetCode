class Solution(object):
    def minOperations(self, nums, x):
        target = sum(nums) - x 
        if target < 0:
            return -1 
        if target == 0 :
            return len(nums)
        left = 0 
        cur_sum = 0 
        max_length = -1
        for right in range(len(nums)):
            cur_sum += nums[right]
            while cur_sum > target:
                cur_sum -= nums[left]
                left+=1
            if cur_sum == target:
                max_length = max(max_length,right-left+1)
        if max_length == -1:
            return -1
        return len(nums) - max_length
        