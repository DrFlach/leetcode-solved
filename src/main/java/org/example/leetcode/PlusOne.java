package org.example.leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            // If the digit is 9, set it to 0 (carry-over)
            digits[i] = 0;
        }

        // If all digits were 9, we need to add a leading 1
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Add the 1 at the start
        return newDigits;
    }
}
