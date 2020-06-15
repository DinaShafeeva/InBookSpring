package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ru.itis.inbook.models.Role;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.models.User;
import ru.itis.inbook.dto.UserDto;

import java.util.List;
import java.util.Optional;

import static ru.itis.inbook.dto.UserDto.from;

@Service
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
    public List<UserDto> search(String login) {
        return from(userRepository.findAllByLoginContainsIgnoreCase(login));
    }

    @Override
    public void addUser(UserDto userDto) {
        User user = User.builder()
                .email(userDto.getEmail())
                .login(userDto.getLogin())
                .role(Role.USER)
                .build();
        userRepository.save(user);
    }

    @Override
    public void filterByLogin(List<UserDto> userDtoList, String name) {
        userDtoList.removeIf(userDto -> !userDto.getLogin().contains(name));
    }
}
