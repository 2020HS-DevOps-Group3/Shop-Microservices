package com.devops.common.dtos.product.request;

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
    private String name;

    @NotNull
    @Min(value = 1)
    private int qty;

    @NotBlank
    private String imageUrl;

    @NotBlank
    private String description;

    @NotNull
    @Min(value = 0)
    private double price;
}
