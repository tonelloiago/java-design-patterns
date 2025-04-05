package com.github.tonelloiago.behavioral.strategy;

import com.github.tonelloiago.behavioral.strategy.domain.Payment;

public class PixPaymentStrategy implements BrazilianPaymentMethodStrategy {
    @Override
    public void pay(Payment payment) {
        System.out.printf("Paying with pix! %s%n", payment.toString());
    }
}
