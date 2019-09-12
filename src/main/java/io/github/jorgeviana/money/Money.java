package io.github.jorgeviana.money;

class Money {
    protected int amount;

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return amount == money.amount;
    }
}
