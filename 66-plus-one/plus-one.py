class Solution:
    def plusOne(self, digits):
        n = len(digits)
        
        for i in range(n - 1, -1, -1):  # iterate from last index to 0
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0

        # if all digits were 9, e.g. [9,9,9]
        nums = [0] * (n + 1)
        nums[0] = 1
        return nums
