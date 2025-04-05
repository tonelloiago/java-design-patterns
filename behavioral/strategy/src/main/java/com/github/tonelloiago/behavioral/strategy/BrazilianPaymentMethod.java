package com.github.tonelloiago.behavioral.strategy;

public enum BrazilianPaymentMethod {
    PIX(new PixPaymentStrategy()),
    CREDITO(new CreditoPaymentStrategy()),
    DREX(null),
    BOLETO(null),
    DEBITO(null);

    private final BrazilianPaymentMethodStrategy strategy;

    BrazilianPaymentMethod(BrazilianPaymentMethodStrategy strategy) {
        this.strategy = strategy;
    }

    public BrazilianPaymentMethodStrategy getStrategy() {
        return this.strategy;
    }
}
