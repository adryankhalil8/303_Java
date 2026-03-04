// EXERCISE: Reverse a Number
// Given an integer like 12345, produce 54321
// Use the SAME while/modulus pattern, but build a reversed number.
//
// Hint: reversed = reversed * 10 + digit

public class Exercise {
    public static void main(String[] args) {

        int num = 12345;
        int reversed = 0;

        // TODO: While num > 0:
        //   1. Extract last digit with % 10
        //   2. Build reversed number: reversed = reversed * 10 + digit
        //   3. Remove last digit with /= 10
        while (reversed < 54321) {
            int digit = num % 10;
            reversed += digit;
            System.out.println(" digit " + digit + ", running sum: " + reversed);
            num/=10;
        }


        System.out.println("Reversed: " + reversed); // Should print 54321
    }
}
