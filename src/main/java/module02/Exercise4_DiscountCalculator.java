// module02/Exercise4_DiscountCalculator.java
package module02;

public class Exercise4_DiscountCalculator {
    public static void main(String[] args) {
        double price = 1200;

        if (price >= 1000) {
            int discount = 20;
            double finalPrice = price - (price * discount / 100);
            System.out.printf("Discount: %d%%, Final price: R%.2f%n", discount, finalPrice);

        } else if (price >= 500) {
            int discount = 10;
            double finalPrice = price - (price * discount / 100);
            System.out.printf("Discount: %d%%, Final price: R%.2f%n", discount, finalPrice);
        }else System.out.printf("Discount: %d%%, Final price: R%.2f%n", 0, price);

    }
}
