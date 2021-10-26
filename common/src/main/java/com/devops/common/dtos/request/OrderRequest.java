package com.devops.common.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    @NotNull
    private List<ProductRequest> products;

    @NotNull
    private int totalQty;

    @NotNull
    private double totalPrice;
}
