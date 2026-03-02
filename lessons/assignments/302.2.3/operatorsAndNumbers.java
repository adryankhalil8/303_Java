// Question 1
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//        int x = 9;
//        System.out.println("x in binary: " + Integer.toBinaryString(x));
//
//        // Predicted: decimal 4, binary 100
//        //Predicted 9: decimal 18, binary n/a
//        //Predicted 17: decimal 34, binary n/a
//        //Predicted 88: decimal 196, binary n/a
//        x = x << 1;
//
//        System.out.println("x in decimal: " + x);
//        System.out.println("x in binary: " + Integer.toBinaryString(x));
//    }
//}



// Question 2
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 150;
//
//        // Print original value and binary
//        System.out.println("Original decimal: " + x);
//        System.out.println("Original binary:  " + Integer.toBinaryString(x));
//
//        // Right shift by 2
//        x = x >> 2;
//
//        /*
//         * Anticipated result:
//         * 150 in binary is 10010110
//         * Shifting right by 2 gives 00100101
//         * Decimal should become 37
//         */
//
//        System.out.println("After shift decimal: " + x);
//        System.out.println("After shift binary:  " + Integer.toBinaryString(x));
//    }
//}
// Question 3
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 7;
//        int y = 17;
//
//        /*
//         * Prediction:
//         n/a
//         */
//
//        int z = x & y;
//
//        System.out.println("Decimal result: " + z);
//        System.out.println("Binary result:  " + Integer.toBinaryString(z));
//    }
//}

// Question 4
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 7;
//        int y = 17;
//
//        /*
//         * Prediction:
//         * 7  = 00000111
//         * 17 = 00010001
//         *
//         * Decimal value should be 23.
//         */
//
//        int z = x | y;
//
//        System.out.println("Decimal result: " + z);
//        System.out.println("Binary result:  " + Integer.toBinaryString(z));
//    }
//}
// Question 5
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 10;
//
//        System.out.println("Before increment: " + x);
//
//        x++;
//
//        System.out.println("After increment: " + x);
//    }
//}
// Question 6
//public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 5;
//
//        System.out.println("Initial value: " + x);
//
//        //  Postfix increment
//        x++;
//        System.out.println("After x++: " + x);
//
//        // 2 Prefix increment
//        ++x;
//        System.out.println("After ++x: " + x);
//
//        // 3️ Addition assignment
//        x += 1;
//        System.out.println("After x += 1: " + x);
//
//    }
//}
// Question 7
// public class operatorsAndNumbers {
//    public static void main(String[] args) {
//
//        int x = 5;
//        int y = 8;

//        int sum = ++x + y;
//        int sum = x++ + y;
//
//        System.out.println("Prefix version:");
//        System.out.println("Sum: " + sum);
//        System.out.println("Value of x after operation: " + x);
//    }
//}