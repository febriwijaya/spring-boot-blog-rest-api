package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class SignUpDto {
    @NotEmpty
    @Size(min = 3, message = "Name should have at least 3 characters")
    private String name;

    @NotEmpty
    @Size(min = 3, message = "Username should have at least 3 characters")
    private String username;

    @NotEmpty
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @NotEmpty
    @Size(min = 3, message = "Password should have at least 3 characters")
    private String password;
}
