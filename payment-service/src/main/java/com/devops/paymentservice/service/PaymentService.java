package com.devops.paymentservice.service;

import com.devops.paymentservice.entity.Payments;
import com.devops.paymentservice.exceptions.PaymentAlreadyMadeException;
import com.devops.paymentservice.repository.PaymentRepository;
import com.devops.paymentservice.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public Payments makePayment(Payments payment) throws PaymentAlreadyMadeException {
        if (this.paymentAlreadyMade(payment.getOrderId()))
            throw new PaymentAlreadyMadeException(Constants.ErrorMessages.PAYMENT_ALREADY_MADE);
        else
            return repository.save(payment);
    }

    public boolean paymentAlreadyMade(String orderId) {
        return repository.existsByOrderId(orderId);
    }
}
