package com.wezaam.withdrawal.service;

import com.wezaam.withdrawal.exception.TransactionException;
import com.wezaam.withdrawal.model.PaymentMethod;
import java.math.BigDecimal;

public interface WithdrawalProcessingService {

    Long sendToProcessing(BigDecimal amount, PaymentMethod paymentMethod) throws TransactionException;

}
