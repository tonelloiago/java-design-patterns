package com.github.tonelloiago.behavioral.strategy.domain;

import com.github.tonelloiago.behavioral.strategy.BrazilianPaymentMethod;

import java.math.BigDecimal;

public record Payment(BigDecimal amount, String debtor, String creditor, BrazilianPaymentMethod method) {

    public void pay() {
        method.getStrategy().pay(this);
    }

}
