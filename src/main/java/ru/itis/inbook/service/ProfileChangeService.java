package ru.itis.inbook.service;

import ru.itis.inbook.dto.SignUpDto;
import ru.itis.inbook.models.User;

public interface ProfileChangeService {
    void update(SignUpDto user);
}
