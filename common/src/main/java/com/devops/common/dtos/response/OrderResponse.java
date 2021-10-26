package com.devops.common.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private String id;

    private int totalQty;

    private double totalPrice;

    private List<ProductResponse> products;
}
