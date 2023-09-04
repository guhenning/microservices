package com.gustavohenning.PaymentService.service;

import com.gustavohenning.PaymentService.model.PaymentRequest;
import com.gustavohenning.PaymentService.model.PaymentResponse;
import org.springframework.http.HttpStatus;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);


    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
