class Solution(object):
    def plusOne(self, digits):
        for i in range(len(digits)): 
            if digits[-(i+1)] < 9:
                digits[-(i+1)] += 1
                return digits
            else:
                digits[-(i+1)] = 0
        return [1] + digits