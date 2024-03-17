package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class LoginDto {
    @NotEmpty
    @Size(min = 3, message = "Username or email should have at least 3 characters")
    private String usernameOrEmail;

    @NotEmpty
    @Size(min = 3, message = "Password should have at least 3 characters")
    private String password;
}
