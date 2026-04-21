package module02;

public class ConditionExercises {

    // Exercise 1
    public static String exercise1_temperatureAlert(int temperature) {
        if (temperature > 30) {
            return "It's hot!";
        } else {
            return "It's not hot.";
        }
    }

    // Exercise 2
    public static String exercise2_ageVerification(int age) {
        if (age >= 18) {
            return "Access granted";
        } else {
            return "Access denied";
        }
    }

    // Exercise 3
    public static String exercise3_evenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }

    // Exercise 4
    public static String exercise4_discountCalculator(double price) {
        int discount;
        if (price > 1000.0) {
            discount = 20;
        } else if (price > 500) {
            discount = 10;
        } else {
            discount = 0;
        }
        double res = price - (price * discount/100);

        String r = String.format("%.2f", res);
        return "Discount: " + discount + "%, Final price: R" + r;
    }

    // Exercise 5
    public static String exercise5_weatherAdvisor(int temperature) {
        String adv;
        if (temperature > 30) {
            adv = "It's hot!";
        } else if (temperature > 15) {
            adv = "It's mild.";
        } else {
            adv = "It's cold.";
        }
        return "Temperature: " + temperature + "°C, Advice: " + adv;
    }

    // Exercise 6
    public static String exercise6_ageGroup(int age) {
        String group;
        if (age < 13) {
            group = "Child";
        } else if (age < 19) {
            group = "Teen";
        } else {
            group = "Adult";
        }
        return "Age: " + age + ", Group: " + group;
    }
}