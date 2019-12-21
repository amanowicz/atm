package com.amanowicz.atm.service;

import com.amanowicz.atm.model.BanknoteAmount;
import com.amanowicz.atm.model.Withdraw;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import static com.amanowicz.atm.config.AtmConfig.ACCEPTED_BANKNOTE_VALUES;

@Service
public class AtmServiceImpl implements AtmService {

    @Override
    public Withdraw doWithdraw(int money) {
        Set<BanknoteAmount> banknoteAmounts = new HashSet<>();
        int moneyLeft = money;
        for (int banknoteValue : ACCEPTED_BANKNOTE_VALUES){
            int amount = moneyLeft / banknoteValue;
            if (amount > 0){
                moneyLeft -= amount * banknoteValue;
                banknoteAmounts.add(new BanknoteAmount(banknoteValue, amount));
            }
        }

        return new Withdraw(banknoteAmounts);
    }
}
