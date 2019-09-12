package io.github.jorgeviana.money;

abstract class Money {
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int amount);

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

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
