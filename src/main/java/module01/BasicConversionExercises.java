package module01;

public class BasicConversionExercises {

    // Exercise 1
    public static int exercise1_addNumbers(int a, int b) {
        return a + b;
    }

    // Exercise 2
    public static boolean exercise2_isEven(int number) {
        return number % 2 == 0;
    }

    // Exercise 3
    public static String exercise3_greet(String name) {
        return "Hello, " + name;
    }

    // Exercise 4
    public static double exercise4_calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Exercise 5
    public static int exercise5_maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }

    // Exercise 6
    public static boolean exercise6_isPositive(int number) {
        return number > 0;
    }

    // Exercise 7
    public static String exercise7_getFirstChar(String text) {
        if (!text.isEmpty()) return String.valueOf(text.toCharArray()[0]);
        else return "";
    }
}