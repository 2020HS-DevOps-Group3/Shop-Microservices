package com.devops.productservice.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotBlank
    private String id;

    @NotNull
    @Min(value = 1)
    private int qty;

    @NotNull
    @Min(value = 0)
    private double price;
}
