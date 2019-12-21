package com.amanowicz.atm.service;

import com.amanowicz.atm.utils.WithdrawUtils;
import com.amanowicz.atm.model.BanknoteAmount;
import com.amanowicz.atm.model.Withdraw;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AtmServiceTest {

    @Autowired
    private AtmService atmService;

    @Test
    public void shouldReturnWithdraw() {
        int moneyToWithdraw = 8550;

        Withdraw actualWithdraw = atmService.doWithdraw(moneyToWithdraw);

        Withdraw expectedWithdraw = WithdrawUtils.createWihdrawWIthBanknotes(
                new BanknoteAmount(200, 42),
                new BanknoteAmount(100, 1),
                new BanknoteAmount(50, 1));

        Assertions.assertEquals(expectedWithdraw, actualWithdraw);
    }

}