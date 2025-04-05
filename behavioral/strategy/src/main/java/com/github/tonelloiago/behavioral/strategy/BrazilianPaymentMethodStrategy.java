package com.github.tonelloiago.behavioral.strategy;

import com.github.tonelloiago.behavioral.strategy.domain.Payment;

public interface BrazilianPaymentMethodStrategy {

    void pay(Payment payment);

}
