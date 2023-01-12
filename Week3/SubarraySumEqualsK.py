class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        output = 0
        leftSum = 0
        maps = {0 : 1}

        for i in nums:
            leftSum += i
            output += maps.get(leftSum - k, 0)
            maps[leftSum] = 1 + maps.get(leftSum, 0)
        
        return output