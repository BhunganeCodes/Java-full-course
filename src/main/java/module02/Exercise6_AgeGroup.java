// module02/Exercise6_AgeGroup.java
package module02;

public class Exercise6_AgeGroup {
    public static void main(String[] args) {
        int age = 15;

        if (age < 13) {
            String group = "Child";
            System.out.printf("Age: %d, Group: %s%n", age, group);
        } else if (age < 20) {
            String group = "Teen";
            System.out.printf("Age: %d, Group: %s%n", age, group);
        } else {
            String group = "Adult";
            System.out.printf("Age: %d, Group: %s%n", age, group);
        }

    }
}
