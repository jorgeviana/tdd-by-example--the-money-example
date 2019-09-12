package io.github.jorgeviana.money;

class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
