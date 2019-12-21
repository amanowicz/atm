package com.amanowicz.atm.config;

import java.util.List;

public final class AtmConfig {

    public static final List<Integer> ACCEPTED_BANKNOTE_VALUES = List.of(200, 100, 50, 20, 10);

    private AtmConfig() {
    }
}
