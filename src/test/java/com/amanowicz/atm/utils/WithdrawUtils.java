package com.amanowicz.atm.utils;

import com.amanowicz.atm.model.BanknoteAmount;
import com.amanowicz.atm.model.Withdraw;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WithdrawUtils {

    public static Withdraw createWihdrawWIthBanknotes(BanknoteAmount... banknotes) {
        if (ArrayUtils.isEmpty(banknotes)) {
            return new Withdraw();
        }

        return new Withdraw(Arrays.stream(banknotes).collect(Collectors.toSet()));
    }


}
