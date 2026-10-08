package org.example;



public class OrderCalculator {

    public double calculateTotal(double price, int quantity) {

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Price cannot be negative"
            );
        }

        if (quantity < 0) {
            throw new IllegalArgumentException(
                    "Quantity cannot be negative"
            );
        }

        return price * quantity;
    }
}
