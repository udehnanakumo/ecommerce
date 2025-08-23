package com.commerce.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal Price;
    private Integer quantity;
    private List<CommentDTO> comments;
    private String image;
}
