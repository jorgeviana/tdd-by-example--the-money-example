package io.github.jorgeviana.money;

class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return amount == money.amount;
    }
}
