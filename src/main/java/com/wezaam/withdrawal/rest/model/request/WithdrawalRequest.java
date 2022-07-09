package com.wezaam.withdrawal.rest.model.request;

public class WithdrawalRequest {

  private String userId;
  private String paymentMethodId;
  private String amount;
  private String executeAt;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getExecuteAt() {
    return executeAt;
  }

  public void setExecuteAt(String executeAt) {
    this.executeAt = executeAt;
  }
}
