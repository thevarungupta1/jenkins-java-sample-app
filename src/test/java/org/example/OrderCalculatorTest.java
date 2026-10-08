package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderCalculatorTest {

    @Test
    void shouldCalculateOrderTotal() {

        OrderCalculator calculator =
                new OrderCalculator();

        double total =
                calculator.calculateTotal(100.0, 2);

        assertEquals(200.0, total);
    }
}