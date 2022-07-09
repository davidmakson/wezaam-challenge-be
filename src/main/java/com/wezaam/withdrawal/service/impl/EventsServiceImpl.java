package com.wezaam.withdrawal.service.impl;

import com.wezaam.withdrawal.model.Withdrawal;
import com.wezaam.withdrawal.model.WithdrawalScheduled;
import com.wezaam.withdrawal.service.EventsService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EventsServiceImpl implements EventsService {

  @Async
  @Override
  public void send(Withdrawal withdrawal) {
    // build and send an event in message queue async
  }

  @Async
  @Override
  public void send(WithdrawalScheduled withdrawal) {
    // build and send an event in message queue async
  }
}
