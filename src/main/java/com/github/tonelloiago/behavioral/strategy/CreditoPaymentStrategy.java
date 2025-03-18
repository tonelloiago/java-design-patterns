package com.github.tonelloiago.behavioral.strategy;

import com.github.tonelloiago.behavioral.strategy.domain.Payment;

public class CreditoPaymentStrategy implements BrazilianPaymentMethodStrategy {
    @Override
    public void pay(Payment payment) {
        System.out.printf("Paying with credit card! %s%n", payment.toString());
    }
}
