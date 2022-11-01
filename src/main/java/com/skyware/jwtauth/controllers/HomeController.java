package com.skyware.jwtauth.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping
    public String home()
    {
        return "Hello";
    }

    @PreAuthorize("hasAnyAuthority('SCOPE_read')")
    @GetMapping("/secure")
    public String secured()
    {
        return "this is securied....";
    }
}
