package com.shop.soteria.data.service;

import com.shop.soteria.data.model.Customer;
import com.shop.soteria.data.model.Product;
import com.shop.soteria.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRespository;

    @Override
    public Customer signUp() {

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
