package com.blog.app.BlogApp.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder extends BCryptPasswordEncoder {

    public static void main(String[] args) {
        PasswordEncoder encoder = new PasswordEncoder();

        System.out.println(encoder.encode("testing"));
    }



}
