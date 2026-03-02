// Example 1
//public class forLoop {
//    public static void main(String[] args) {
//        int n = 5;
//        // for loop
//        for (int i = 1; i <= n; ++i) {
//            System.out.println("Java is fun");
//        }
//    }
//}

//Example 2
//public class forLoop {
//    public static void main(String[] args) {
//        int sum = 0;
//        int n = 1000;
//        // for loop
//        for (int i = 1; i <= n; ++i) {
//            // body inside for loop
//            sum += i;     // sum = sum + i
//        }
//        System.out.println("Sum = " + sum);
//        }
//    }

    //Example 3
//    public class forLoop {
//
//    }
//        public static void main(String[] args) {
//            String original, reverse = ""; // Objects of String class
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter a string/number to check if it is a palindrome");
//            original = in.nextLine();
//            int length = original.length();
//            for ( int i = length - 1; i >= 0; i-- )
//                reverse = reverse + original.charAt(i);
//            if (original.equals(reverse)) {
//                System.out.println("Entered string/number is a palindrome.");
//            }else
//            {
//                System.out.println("Entered string/number isn't a palindrome.");
//        }
//    }
// Example 4
public class forLoop {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
