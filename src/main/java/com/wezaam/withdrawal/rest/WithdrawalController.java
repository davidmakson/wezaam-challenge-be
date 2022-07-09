package com.wezaam.withdrawal.rest;

import com.wezaam.withdrawal.service.PaymentMethodService;
import com.wezaam.withdrawal.service.UserService;
import com.wezaam.withdrawal.service.WithdrawalService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class WithdrawalController {

    private UserService userService;
    private WithdrawalService withdrawalService;
    private PaymentMethodService paymentMethodService;
    private Logger logger;

    @Autowired
    public WithdrawalController(UserService userService, WithdrawalService withdrawalService,
        PaymentMethodService paymentMethodService, Logger logger) {
        this.userService = userService;
        this.withdrawalService = withdrawalService;
        this.paymentMethodService = paymentMethodService;
        this.logger = logger;
    }

    @PostMapping("/create-withdrawals")
    public ResponseEntity create(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String paymentMethodId = request.getParameter("paymentMethodId");
        String amount = request.getParameter("amount");
        String executeAt = request.getParameter("executeAt");

        if (userId == null || paymentMethodId == null || amount == null || executeAt == null) {
            return new ResponseEntity("Required params are missing", HttpStatus.BAD_REQUEST);
        }
        if (userService.findById(Long.parseLong(userId)).isEmpty()) {
            return new ResponseEntity("User not found", HttpStatus.NOT_FOUND);
        }
        if (paymentMethodService.findById(Integer.parseInt(paymentMethodId)).isEmpty()) {
            return new ResponseEntity("Payment method not found", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(withdrawalService
            .createOrScheduleWithdrawal(userId, paymentMethodId, amount, executeAt), HttpStatus.OK);
    }

    @GetMapping("/find-all-withdrawals")
    public ResponseEntity findAll() {
        return new ResponseEntity(withdrawalService.findAll(), HttpStatus.OK);
    }
}
