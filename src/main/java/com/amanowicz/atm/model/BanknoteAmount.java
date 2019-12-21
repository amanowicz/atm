package com.amanowicz.atm.model;

import java.util.Objects;

public class BanknoteAmount {

    private int value;
    private int amount;

    public BanknoteAmount(int value, int amount) {
        this.value = value;
        this.amount = amount;
    }

    public int getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanknoteAmount that = (BanknoteAmount) o;
        return value == that.value &&
                amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, amount);
    }

    @Override
    public String toString() {
        return "{" +
                value +
                ", amount=" + amount +
                '}';
    }
}
