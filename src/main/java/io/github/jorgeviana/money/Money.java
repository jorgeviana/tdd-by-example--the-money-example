package io.github.jorgeviana.money;

abstract class Money {
    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int amount);

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
