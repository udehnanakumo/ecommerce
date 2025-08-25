package com.commerce.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {
    private Long id;
    private Long productId;
    @PositiveOrZero(message = "Quantity must be positive")
    private Integer quantity;
    @Positive(message = "Price must be positive")
    private BigDecimal price;
}
