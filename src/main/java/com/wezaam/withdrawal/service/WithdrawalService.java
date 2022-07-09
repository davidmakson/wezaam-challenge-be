package com.wezaam.withdrawal.service;

import com.wezaam.withdrawal.model.Withdrawal;
import com.wezaam.withdrawal.model.WithdrawalScheduled;
import java.util.List;

public interface WithdrawalService {

    void run();

    void create(Withdrawal withdrawal);

    void schedule(WithdrawalScheduled withdrawalScheduled);

    void processScheduled(WithdrawalScheduled withdrawal);

    List<Object> findAll();

    Object createOrScheduleWithdrawal(String userId, String paymentMethodId, String amount, String executeAt);
}
