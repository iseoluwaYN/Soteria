package com.shop.soteria.data.service.userService;

import com.shop.soteria.data.dto.UserDto;
import com.shop.soteria.data.model.Product;

import com.shop.soteria.data.model.User;
import com.shop.soteria.data.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    UserRepository customerRepository;
    @Override
    public User signUp(UserDto userDto) {
        return null;
    }

    @Override
    public boolean addToCart(Product prodName) {
        return false;
    }

    @Override
    public boolean removeFromCart(Product product) {
        return false;
    }
}
