package com.skyware.jwtauth.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class LoginRequest {
    private String username;
    private String password;

//    public LoginRequest(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }

}

