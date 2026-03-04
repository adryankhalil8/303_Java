import java.util.Scanner;
public class paLoops {
    // Task 1
//    public static void main(String[] args) {
//        int size = 10;
//
//        // header row
//        System.out.print("    ");
//        for (int col = 1; col <= size; col++) {
//            System.out.printf("%4d", col);
//        }
//        System.out.println();
//
//        // table body
//        for (int row = 1; row <= size; row++) {
//            System.out.printf("%4d", row);
//            for (int col = 1; col <= size; col++) {
//                System.out.printf("%4d", row * col);
//            }
//            System.out.println();
//        }
//    }
    //Task 2

//        static Scanner sc = new Scanner(System.in);
//        public static void main(String[] args) {
//
//        System.out.print("Enter first positive integer: ");
//        int n1 = sc.nextInt();
//
//        System.out.print("Enter second positive integer: ");
//        int n2 = sc.nextInt();
//
//        sc.close();
//
//        if (n1 <= 0 || n2 <= 0) {
//            System.out.println("Inputs must be positive.");
//            return;
//        }
//
//        int gcd = 1;
//        int limit = Math.min(n1, n2);
//
//        for (int k = 2; k <= limit; k++) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                gcd = k;
//            }
//        }
//
//        System.out.println("The gcd is " + gcd);
//    }
    // Task 3
public static void main(String[] args) {
    double tuition = 10000.0;
    double target = tuition * 2;
    int years = 0;

    while (tuition < target) {
        tuition *= 1.07;
        years++;
    }

    System.out.println("Years to double: " + years);
    System.out.printf("Tuition after %d years: $%.2f%n", years, tuition);
}

}

