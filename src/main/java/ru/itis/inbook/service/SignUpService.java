package ru.itis.inbook.service;

import ru.itis.inbook.dto.SignUpDto;

public interface SignUpService {
    boolean signUp(SignUpDto form);
}
