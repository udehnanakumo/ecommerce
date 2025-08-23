package com.commerce.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private String content;
    private Integer score;
    private Long userId;
}
