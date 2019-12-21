package com.amanowicz.atm.service;

import com.amanowicz.atm.model.Withdraw;

public interface AtmService {

    Withdraw doWithdraw(int money);
}
