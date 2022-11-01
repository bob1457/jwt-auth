package com.skyware.jwtauth.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
public final class LoginRequest {
    private final String username;
    private final String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

