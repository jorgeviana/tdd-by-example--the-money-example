package io.github.jorgeviana.money;

class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
