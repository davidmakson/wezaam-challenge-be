package com.wezaam.withdrawal.service;

import com.wezaam.withdrawal.model.Withdrawal;
import com.wezaam.withdrawal.model.WithdrawalScheduled;

public interface EventsService {

    void send(Withdrawal withdrawal);
    void send(WithdrawalScheduled withdrawal);

}
