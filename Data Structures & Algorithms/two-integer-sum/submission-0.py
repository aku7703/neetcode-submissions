class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # assume every input has exactly one pair of i & j that satisfy condition. 
        # hash map sol
        prevMap = {}

        for i, n in enumerate(nums):
            difference = target - n
            if difference in prevMap:
                return [prevMap[difference], i]
            else:
                prevMap[n]= i

