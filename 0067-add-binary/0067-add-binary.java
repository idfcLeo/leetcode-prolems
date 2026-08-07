import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        // Parse strings using base 2
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Add them together
        BigInteger sum = num1.add(num2);
        
        // Convert back to a binary string
        return sum.toString(2);
    }
}
