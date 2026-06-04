package module04;

public class MethodExercises {

    // Exercise 1
    public static boolean exercise1_checkEven(int num) {
        return num % 2 == 0;
    }

    // Exercise 2
    public static String exercise2_greetUser(String name) {
        return String.format("Hello, %s!", name);
    }

    // Exercise 3
    public static int exercise3_calculateSum(int a, int b) {
        return a + b;
    }

    // Exercise 4
    public static int exercise4_findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Exercise 5
    public static boolean exercise5_isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}