package com.amanowicz.atm.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Withdraw {

    private Set<BanknoteAmount> banknoteAmounts;
    private Currency currency;

    public Withdraw() {
        this.banknoteAmounts = new HashSet<>();
        this.currency = Currency.EUR;
    }

    public Withdraw(Set<BanknoteAmount> banknoteAmounts) {
        this.banknoteAmounts = banknoteAmounts;
        this.currency = Currency.EUR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdraw withdraw = (Withdraw) o;
        return Objects.equals(banknoteAmounts, withdraw.banknoteAmounts) &&
                currency == withdraw.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(banknoteAmounts, currency);
    }

    @Override
    public String toString() {
        return "Withdraw{" + banknoteAmounts +
                ", currency=" + currency +
                '}';
    }
}
