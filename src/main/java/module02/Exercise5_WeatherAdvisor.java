// module02/Exercise5_WeatherAdvisor.java
package module02;

public class Exercise5_WeatherAdvisor {
    public static void main(String[] args) {
        int temperature = 35;

        if (temperature >= 30) {
            String advice = "It's hot!";
            System.out.printf("Temperature: %d°C, Advice: %s", temperature, advice);
        }
        else if (temperature >= 15) {
            String advice = "It's mild.";
            System.out.printf("Temperature: %d°C, Advice: %s", temperature, advice);
        }
        else {
            String advice = "It's cold.";
            System.out.printf("Temperature: %d°C, Advice: %s", temperature, advice);
        }


    }
}
