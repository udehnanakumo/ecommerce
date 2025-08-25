package com.commerce.dto;

import jakarta.validation.constraints.NotBlank;
import  lombok.Data;

import com.commerce.model.Order;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class  OrderDTO {
    private Long id;
    private Long userId;
    @NotBlank(message = "Address is required")
    private String address;
    @NotBlank(message = "Phone Number is required")
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDateTime createdAt;
    private List<OrderItemDTO> orderItems;
}
