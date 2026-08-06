class Solution {
    public int[] plusOne(int[] digits) {
        // Loop from the last digit to the first digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed, return immediately
            }
            // If the digit is 9, it becomes 0 due to the carry
            digits[i] = 0;
        }
        
        // If the loop finishes, it means all digits were 9 (e.g., 999 -> 1000)
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // The rest defaults to 0 automatically in Java
        return newNumber;
    }
}
