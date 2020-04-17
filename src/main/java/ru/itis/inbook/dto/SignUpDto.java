package ru.itis.inbook.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String login;
    private String email;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
