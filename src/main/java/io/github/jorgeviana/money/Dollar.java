package io.github.jorgeviana.money;

class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object other) {
        Dollar dollar = (Dollar) other;
        return amount == dollar.amount;
    }
}
