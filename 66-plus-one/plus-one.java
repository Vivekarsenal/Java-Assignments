class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, done
            }
            // else set current to 0 and carry 1 to next
            digits[i] = 0;
        }

        // If we reach here, it means all were 9s (like 999 -> 1000)
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
