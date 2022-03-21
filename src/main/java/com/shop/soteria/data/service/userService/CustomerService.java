package com.shop.soteria.data.service.userService;

import com.shop.soteria.data.dto.UserDto;
import com.shop.soteria.data.model.Product;
import com.shop.soteria.data.model.User;

public interface CustomerService {
    User signUp(UserDto userDto);
    boolean addToCart(Product prodName);
    boolean removeFromCart(Product product);
}
