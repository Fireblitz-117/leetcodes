class Solution(object):
    def twoSum(self, nums, target):
        #i is first term, k is the second term
        for i in range(len(nums)):
            for k in range(len(nums)):
                if nums[i] + nums[k] == target and k != i:
                    return i, k