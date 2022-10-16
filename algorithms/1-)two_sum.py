"""Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]."""

class Solution(object):
    def twoSum(self, nums, target):
        counter = 1
        returnList = []
        d = {}
        b = 0
        for i, j in enumerate(nums):
            j = target - nums[i]
            if j in nums and nums.index(j) != i:
                b = nums.index(j)
                return[i,b]



        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

p1: Solution = Solution()
print(p1.twoSum([3,0,1,2,1,6],6))
