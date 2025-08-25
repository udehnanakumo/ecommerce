package com.commerce.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    @NotBlank(message = "Content ie required")
    private String content;
    @Min(value = 1)
    @Max(value = 5)
    private Integer score;
    private Long userId;
}
