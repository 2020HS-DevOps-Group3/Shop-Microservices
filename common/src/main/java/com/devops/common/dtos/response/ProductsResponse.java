package com.devops.common.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.devops.common.dtos.product.response.ProductResponse;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsResponse {
    private Set<ProductResponse> productResponseSet;
}
