class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        n = len(nums)//2
        nums2 = set(nums)
        for ele in nums2:
            if nums.count(ele)>n:
                return ele

        