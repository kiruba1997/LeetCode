class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        left = 0
        right = len(numbers)-1
        while(left<right):
            cur_sum = numbers[left]+numbers[right]
            if cur_sum == target:
                return [left+1,right+1]
            if cur_sum>target:
                right-=1
            else:
                left+=1
        