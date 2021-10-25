package com.devops.paymentservice.service;

import com.devops.common.enums.PaymentStatus;
import com.devops.common.exceptions.PaymentAlreadyMadeException;
import com.devops.common.exceptions.PaymentNotFoundException;
import com.devops.common.utils.Constants;
import com.devops.common.utils.ServiceUtils;
import com.devops.paymentservice.dtos.request.PaymentRequest;
import com.devops.paymentservice.dtos.response.PaymentResponse;
import com.devops.paymentservice.entity.Payments;
import com.devops.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentResponse makePayment(PaymentRequest request) throws PaymentAlreadyMadeException {
        if (this.paymentAlreadyMade(request.getOrderId()))
            throw new PaymentAlreadyMadeException(Constants.ErrorMessages.PAYMENT_ALREADY_MADE);
        else {
            Payments payment = ServiceUtils.standardModelMapper(request, Payments.class);
            payment.setStatus(this.getRandomStatus());
            Payments savedPayment = repository.save(payment);
            return ServiceUtils.standardModelMapper(savedPayment, PaymentResponse.class);
        }
    }

    public boolean paymentAlreadyMade(String orderId) {
        return repository.existsByOrderId(orderId);
    }

    private PaymentStatus getRandomStatus() {
        return new Random().nextBoolean() ? PaymentStatus.SUCCESS : PaymentStatus.FAILED;
    }

    public PaymentResponse getPaymentsByOrderId(String orderId) throws PaymentNotFoundException {
        Payments payment = repository.findByOrderId(orderId)
                .orElseThrow(() -> new PaymentNotFoundException(Constants.ErrorMessages.PAYMENT_NOT_FOUND));
        return ServiceUtils.standardModelMapper(payment, PaymentResponse.class);
    }
}
