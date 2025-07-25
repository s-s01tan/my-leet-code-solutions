class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        result = 0
        num_dict = {}
        
        for num in nums:
            to_complete = k - num
            if num_dict.get(to_complete, 0) > 0:
                num_dict[to_complete] -= 1
                result += 1
            else:
                num_dict[num] = num_dict.get(num, 0) + 1

        return result
