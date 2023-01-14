class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        total = sum(chalk)
        result = 0
        k %= total
        for i, nums in enumerate(chalk):
            if k < nums:
                result = i
                break
            k -=nums
            
        return result
            