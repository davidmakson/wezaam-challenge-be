package com.wezaam.withdrawal.service;

import com.wezaam.withdrawal.model.PaymentMethod;
import java.util.Optional;

public interface PaymentMethodService {

  Optional<PaymentMethod> findById(long parseLong);

}
