package io.github.jorgeviana.money;

class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object other) {
        Franc dollar = (Franc) other;
        return amount == dollar.amount;
    }
}
