package ru.itis.inbook.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String login;
    private String email;
    private String password;

}
