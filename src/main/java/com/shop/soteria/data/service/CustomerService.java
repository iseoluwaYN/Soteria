package com.shop.soteria.data.service;

import com.shop.soteria.data.model.Customer;
import com.shop.soteria.data.model.Product;

public interface CustomerService {
    Customer signUp();
    boolean addToCart(Product prodName);
    boolean removeFromCart(Product product);
}
