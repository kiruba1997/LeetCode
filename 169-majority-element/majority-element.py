class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        n = len(nums) 
        # for ele in nums:
        #     if nums.count(ele)>n//2:
        #         return ele

        pairs = {}
        for ele in nums:
            pairs[ele] = pairs.get(ele,0)+1
            if pairs.get(ele) > n//2:
                return ele