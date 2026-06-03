package module02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionExercisesTest {

    // ---------------------------------------------------------
    // Helper method to capture printed output
    // ---------------------------------------------------------
    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outputStream));

        try {
            runnable.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().trim();
    }

    // =========================================================
    // Exercise 1: Temperature Alert
    // =========================================================

    @Test
    void testExercise1_temperatureAlert_hot() {
        String output = captureOutput(() ->
                Exercise1_TemperatureAlert.main(null)
        );

        assertEquals("It's hot!", output);
    }

    @Test
    void testExercise1_temperatureAlert_exactOutput() {
        String output = captureOutput(() ->
                Exercise1_TemperatureAlert.main(null)
        );

        // Ensures punctuation and capitalization are exact
        assertTrue(output.equals("It's hot!"));
    }

    @Test
    void testExercise1_temperatureAlert_noExtraWhitespace() {
        String output = captureOutput(() ->
                Exercise1_TemperatureAlert.main(null)
        );

        assertEquals(output.trim(), output);
    }

    @Test
    void testExercise1_temperatureAlert_containsHotWord() {
        String output = captureOutput(() ->
                Exercise1_TemperatureAlert.main(null)
        );

        assertTrue(output.contains("hot"));
    }

    // =========================================================
    // Exercise 2: Age Verification
    // =========================================================

    @Test
    void testExercise2_ageVerification_accessGranted() {
        String output = captureOutput(() ->
                Exercise2_AgeVerification.main(null)
        );

        assertEquals("Access granted", output);
    }

    @Test
    void testExercise2_ageVerification_exactOutput() {
        String output = captureOutput(() ->
                Exercise2_AgeVerification.main(null)
        );

        // Ensures exact wording
        assertTrue(output.equals("Access granted"));
    }

    @Test
    void testExercise2_ageVerification_containsGranted() {
        String output = captureOutput(() ->
                Exercise2_AgeVerification.main(null)
        );

        assertTrue(output.contains("granted"));
    }

    @Test
    void testExercise2_ageVerification_noExtraWhitespace() {
        String output = captureOutput(() ->
                Exercise2_AgeVerification.main(null)
        );

        assertEquals(output.trim(), output);
    }

    // =========================================================
    // Exercise 3: Even or Odd
    // =========================================================

    @Test
    void testExercise3_evenOrOdd_odd() {
        String output = captureOutput(() ->
                Exercise3_EvenOrOdd.main(null)
        );

        assertEquals("7 is odd", output);
    }

    // =========================================================
    // Exercise 4: Discount Calculator
    // =========================================================

    @Test
    void testExercise4_discountCalculator_formatting() {
        String output = captureOutput(() ->
                Exercise4_DiscountCalculator.main(null)
        );

        assertEquals("Discount: 20%, Final price: R960.00", output);
    }

    @Test
    void testExercise4_discountCalculator_decimalFormatting() {
        String output = captureOutput(() ->
                Exercise4_DiscountCalculator.main(null)
        );

        // Ensures two decimal places exist
        assertTrue(output.matches(".*R\\d+\\.\\d{2}$"));
    }

    @Test
    void testExercise4_discountCalculator_containsPercentSymbol() {
        String output = captureOutput(() ->
                Exercise4_DiscountCalculator.main(null)
        );

        assertTrue(output.contains("%"));
    }

    // =========================================================
    // Exercise 5: Weather Advisor
    // =========================================================

    @Test
    void testExercise5_weatherAdvisor_hot() {
        String output = captureOutput(() ->
                Exercise5_WeatherAdvisor.main(null)
        );

        assertEquals(
                "Temperature: 35°C, Advice: It's hot!",
                output
        );
    }

    @Test
    void testExercise5_weatherAdvisor_containsDegreeSymbol() {
        String output = captureOutput(() ->
                Exercise5_WeatherAdvisor.main(null)
        );

        assertTrue(output.contains("°C"));
    }

    @Test
    void testExercise5_weatherAdvisor_outputFormat() {
        String output = captureOutput(() ->
                Exercise5_WeatherAdvisor.main(null)
        );

        assertTrue(output.startsWith("Temperature:"));
    }

    // =========================================================
    // Exercise 6: Age Group
    // =========================================================

    @Test
    void testExercise6_ageGroup_teen() {
        String output = captureOutput(() ->
                Exercise6_AgeGroup.main(null)
        );

        assertEquals("Age: 15, Group: Teen", output);
    }

    @Test
    void testExercise6_ageGroup_containsGroupLabel() {
        String output = captureOutput(() ->
                Exercise6_AgeGroup.main(null)
        );

        assertTrue(output.contains("Group:"));
    }
}
