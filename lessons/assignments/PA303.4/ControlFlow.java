//Part 1
//public class ControlFlow {
//    public static void main(String[] args) {
//        int x = 7;
//        if (x < 10) {
//            System.out.println("Less than 10");
//        }
//    }
//}

//Part 2
//public class ControlFlow {
//    public static void main(String[] args) {
//        int x = 50;
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else {
//            System.out.println("Greater than 10");
//        }
//    }
//}

//Part 3
//public class ControlFlow {
//    public static void main(String[] args) {
//        int x = 50;
//        if (x < 10) {
//            System.out.println("Less than 10");
//        } else if (x > 10 && x < 20) {
//            System.out.println("Between 10 and 20");
//        } else {
//            System.out.println("Greater than or equal to 20");
//        }
//    }
//}

// Part 4
//public class ControlFlow {
//    public static void main(String[] args) {
//        int x = 15;
//        if (x > 10 && x < 20) {
//            System.out.println("Out of Range");
//        } else {
//            System.out.println("In Range");
//        }
//    }
//}

import java.util.Scanner;

// Part 5
//public class ControlFlow {
//    public static void main(String[] args) {
//        int score = 85;
//        char grade;
//
//        if (score < 0 || score > 100) {
//            System.out.println("Invalid score: " + score);
//            return;
//        }
//
//        if (score >= 90) grade = 'A';
//        else if (score >= 80) grade = 'B';
//        else if (score >= 70) grade = 'C';
//        else if (score >= 60) grade = 'D';
//        else grade = 'F';
//
//        System.out.println("The grade is: " + grade);
//    }
//}

//Part 6
//public class ControlFlow {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        sc.close();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Out of range");
//        }
//    }
//}

//Part 7
public class ControlFlow {

    // Rates for each bracket (same for all statuses)
    private static final double[] RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    // Bracket upper limits for each filing status (top bracket has no upper limit, so it's omitted)
    // 0 = Single
    // 1 = Married Filing Jointly / Qualifying Widow(er)
    // 2 = Married Filing Separately
    // 3 = Head of Household
    private static final double[][] BRACKETS = {
            {  8350,  33950,  82250, 171550, 372950}, // Single
            { 16700,  67900, 137050, 208850, 372950}, // Married Filing Jointly
            {  8350,  33950,  68525, 104425, 186475}, // Married Filing Separately
            { 11950,  45500, 117450, 190200, 372950}  // Head of Household
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Filing Status:");
        System.out.println("0 = Single");
        System.out.println("1 = Married Filing Jointly / Qualifying Widow(er)");
        System.out.println("2 = Married Filing Separately");
        System.out.println("3 = Head of Household");
        System.out.print("Enter status (0-3): ");

        int status = sc.nextInt();

        System.out.print("Enter taxable income: ");
        double income = sc.nextDouble();
        sc.close();

        if (status < 0 || status > 3 || income < 0) {
            System.out.println("Out of range");
            return;
        }

        double tax = computeTax(status, income);
        System.out.printf("Tax owed: $%.2f%n", tax);
    }

    private static double computeTax(int status, double income) {
        double tax = 0.0;
        double prev = 0.0;

        double[] caps = BRACKETS[status];

        // Apply each bracket up to its cap
        for (int i = 0; i < caps.length; i++) {
            double cap = caps[i];
            if (income > cap) {
                tax += (cap - prev) * RATES[i];
                prev = cap;
            } else {
                tax += (income - prev) * RATES[i];
                return tax;
            }
        }

        // Anything above the last cap is taxed at the top rate
        tax += (income - prev) * RATES[RATES.length - 1];
        return tax;
    }
}