package com.shop.soteria.data.service.userService;

import com.shop.soteria.data.enums.Roles;
import com.shop.soteria.data.model.User;
import com.shop.soteria.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllUsers(Roles role) {
        return null;
    }
}
