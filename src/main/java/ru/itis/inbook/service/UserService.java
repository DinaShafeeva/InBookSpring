package ru.itis.inbook.service;

import ru.itis.inbook.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

    List<UserDto> search(String name);

    UserDto findUser(Long id);

    void addUser(UserDto userDto);

    void filterByLogin(List<UserDto> userDtoList, String login);

    }
