public class CoreJavaBasics {

    public static void main(String[] args) {


        int a = 8;
        int b = 12;
        int sumInt = a + b;
        System.out.println("Integer sum: " + sumInt);


        double d1 = 5.5;
        double d2 = 2.3;
        double sumDouble = d1 + d2;
        System.out.println("Double sum: " + sumDouble);


        int intVal = 7;
        double doubleVal = 3.5;
        double mixedSum = intVal + doubleVal;  // Must be double
        System.out.println("Mixed sum: " + mixedSum);
        // The sum must be double because Java promotes int to double automatically.


        int larger = 20;
        int smaller = 6;
        int divisionResult = larger / smaller;
        System.out.println("Integer division result: " + divisionResult);
        // Output is truncated (no decimals)

        double largerDecimal = 20.0;
        double correctedDivision = largerDecimal / smaller;
        System.out.println("Corrected division result: " + correctedDivision);
        // Correction needed: at least one value must be double


        double num1 = 15.0;
        double num2 = 4.0;
        double divisionDouble = num1 / num2;
        System.out.println("Double division result: " + divisionDouble);

        int castedResult = (int) divisionDouble;
        System.out.println("Casted to int: " + castedResult);


        int x = 5;
        int y = 6;

        int q = y / x;
        System.out.println("Integer division y/x: " + q);

        double q2 = (double) y / x;
        System.out.println("Double division y/x: " + q2);


        final double PI = 3.14159;
        double radius = 4;
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);


        double coffee = 3.50;
        double cappuccino = 4.25;
        double espresso = 2.75;

        double subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);

        final double SALES_TAX = 0.07;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Total with tax: $%.2f\n", totalSale);
    }
}