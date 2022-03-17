package com.shop.soteria.data.service.customerService;

import com.shop.soteria.data.dto.UserDto;
import com.shop.soteria.data.model.Customer;
import com.shop.soteria.data.model.Product;

import com.shop.soteria.data.repository.CustomerRepository;
import com.shop.soteria.data.service.customerService.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer signUp(UserDto userDto) {
        if(userDto != null){
            validateUser(userDto);
            ModelMapper map = new ModelMapper();
        }
            return null;
    }

    private void validateUser(UserDto userDto) {

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
