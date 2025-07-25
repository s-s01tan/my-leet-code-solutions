class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        current_sum = sum(nums[:k])
        max_average_value = current_sum / k

        for i in range(k, len(nums)):
            current_sum += nums[i] - nums[i - k]
            max_average_value = max(max_average_value, current_sum / k)
    
        return max_average_value