package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.inbook.models.Role;
import ru.itis.inbook.models.User;
import ru.itis.inbook.repository.UserRepository;

import java.util.Optional;

@Service
public class ConfirmServiceImpl implements ConfirmService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean confirm(String confirmCode) {
        Optional<User> userOptional = userRepository.findByConfirmCode(confirmCode);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setRole(Role.USER);
            userRepository.save(user);
            return true;
        }
        return false;

    }
}
