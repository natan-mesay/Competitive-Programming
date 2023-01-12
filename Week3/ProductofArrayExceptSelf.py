class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] *len(nums)
        prefixSum = 1

        for i in range(len(nums)):
            output[i] = prefixSum
            prefixSum *= nums[i]
        
        postfixSum = 1

        for i in range(len(nums) - 1 , -1, -1):
            output[i] *= postfixSum
            postfixSum *= nums[i]

        return output