package com.project.uber.uberApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class LoginRequestDto {
    private String email;
    private String password;
}

