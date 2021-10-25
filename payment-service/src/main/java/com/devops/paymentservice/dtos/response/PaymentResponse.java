package com.devops.paymentservice.dtos.response;

import com.devops.common.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {

    private String id;
    private String orderId;
    private PaymentStatus status;
    private double totalPrice;
}
