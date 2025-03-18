package com.github.tonelloiago;

import com.github.tonelloiago.behavioral.strategy.BrazilianPaymentMethod;
import com.github.tonelloiago.behavioral.strategy.domain.Payment;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var pixPayment = new Payment(BigDecimal.TEN, "Iago", "Carlos", BrazilianPaymentMethod.PIX);
        pixPayment.pay();

        var creditPayment = new Payment(BigDecimal.ONE, "Patrícia", "Eduardo", BrazilianPaymentMethod.CREDITO);
        creditPayment.pay();

    }
}