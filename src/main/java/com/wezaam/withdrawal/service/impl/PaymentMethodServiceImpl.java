package com.wezaam.withdrawal.service.impl;

import com.wezaam.withdrawal.model.PaymentMethod;
import com.wezaam.withdrawal.repository.PaymentMethodRepository;
import com.wezaam.withdrawal.service.PaymentMethodService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

  @Autowired
  PaymentMethodRepository paymentMethodRepository;

  @Override
  public Optional<PaymentMethod> findById(long parseLong) {
    return paymentMethodRepository.findById(parseLong);
  }
}
