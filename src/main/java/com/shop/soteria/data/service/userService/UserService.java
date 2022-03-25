package com.shop.soteria.data.service.userService;

import com.shop.soteria.data.enums.Roles;
import com.shop.soteria.data.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User register(User user);
    List<User> getAllUsers();
    List<User> getAllUsers(Roles role);
}
