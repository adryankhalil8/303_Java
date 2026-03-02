import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Java Intro
//public class PAstrings {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
//        sc.close();
//
//        // 1) Sum lengths
//        System.out.println(A.length() + B.length());
//
//        // 2) Lexicographic comparison
//        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
//
//        // 3) Capitalize first letter of each
//        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
//        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
//        System.out.println(capA + " " + capB);
//    }
//}

//Java Substring
//public class PAstrings {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(S.substring(start, end));
//    }
//}

//Substring Comparisons
//public class PAstrings {
//
//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = s.substring(0, k);
//        String largest = s.substring(0, k);
//
//        for (int i = 1; i <= s.length() - k; i++) {
//            String sub = s.substring(i, i + k);
//
//            if (sub.compareTo(smallest) < 0) smallest = sub;
//            if (sub.compareTo(largest) > 0) largest = sub;
//        }
//
//        return smallest + "\n" + largest;
//    }
//}
// String Reverse
//
//public class PAstrings {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String reversed = new StringBuilder(A).reverse().toString();
//        System.out.println(A.equals(reversed) ? "Yes" : "No");
//
//    }
//}

//String Tokens
public class PAstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}