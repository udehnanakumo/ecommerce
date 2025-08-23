package com.commerce.dto;

import lombok.Data;

@Data
public class PasswordRequestChange {
    private String currentPassword;
    private String newPassword;
}
