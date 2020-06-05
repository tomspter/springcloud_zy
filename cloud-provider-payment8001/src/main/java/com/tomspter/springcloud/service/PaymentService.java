package com.tomspter.springcloud.service;

import com.tomspter.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
