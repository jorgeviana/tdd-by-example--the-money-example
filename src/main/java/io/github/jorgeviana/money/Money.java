package io.github.jorgeviana.money;

abstract class Money {
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount, null);
    }

    abstract Money times(int amount);

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object other) {
        Money money = (Money) other;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
