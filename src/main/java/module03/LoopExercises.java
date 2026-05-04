package module03;

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
        int idx = 0;

        do {
            if (pins[idx] != 1234) {
                idx++;
                result++;
            }
        } while (pins[idx] != 1234);

        return result;
    }

    // Exercise 3
    public static int exercise3_sumUntilZero(int[] numbers) {
        return 0;
    }

    // Exercise 4
    public static String exercise4_numberPrinter(int n) {
        return null;
    }

    // Exercise 5
    public static String exercise5_passwordChecker(String[] attempts) {
        return null;
    }

    // Exercise 6
    public static String exercise6_evenNumbers(int n) {
        return null;
    }
}