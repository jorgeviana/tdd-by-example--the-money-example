package io.github.jorgeviana.money;

class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object other) {
        Money dollar = (Money) other;
        return amount == dollar.amount;
    }
}
