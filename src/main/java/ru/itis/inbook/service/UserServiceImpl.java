package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.models.User;
import ru.itis.inbook.dto.UserDto;

import java.util.List;

import static ru.itis.inbook.dto.UserDto.from;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        return from(userRepository.findAll());
    }

    @Override
    public UserDto findUser(Long id) {
        User user = userRepository.getOne(id);
        return from(user);
    }

    @Override
    public List<UserDto> search(String name) {
        return from(userRepository.findAllByNameContainsIgnoreCase(name));
    }

}
