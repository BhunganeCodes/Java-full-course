package module03;

import java.util.Objects;

public class LoopExercises {

    // Exercise 1
    public static int exercise1_guessingGame(int[] guesses, int secret) {
        int count = 0;
        for (int i : guesses) {
            count++;
            if (i == secret) break;
        }
        return count;
    }

    // Exercise 2
    public static int exercise2_pinValidator(int[] pins) {
        int result = 1;
        int idx = -1;
        int attempts = 0;

        do {
            attempts++;
            idx++;
        } while (pins[idx] != 1234);

        return attempts;
    }

    // Exercise 3
    public static int exercise3_sumUntilZero(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            if (num == 0) {
                break;
            }
            result += num;
        }
        return result;
    }

    // Exercise 4
    public static String exercise4_numberPrinter(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if (i % 5 == 0) continue;
            if (i == n - 1) {
                sb.append(i);
            } else {
                sb.append(i + ", ");
            }
        }
        return sb.toString().trim();
    }

    // Exercise 5
    public static String exercise5_passwordChecker(String[] attempts) {
        int maxAttempts = 3;
        int attemptNum = 0;
        String password = "secret";

         for (String w : attempts) {
             attemptNum++;
             if (w.toLowerCase() == password) return "Access granted!";
             if (attemptNum == maxAttempts) return "Access denied";

         }
        return "Access denied";
    }

    // Exercise 6
    public static String exercise6_evenNumbers(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            if (i == 0) continue;
            if (i % 2 == 0 && i == n) sb.append(i);
            else if (i % 2 == 0) sb.append(i + ", ");
        }
        return sb.toString();
    }
}