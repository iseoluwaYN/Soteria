package com.shop.soteria.data.service;

import com.shop.soteria.data.model.Product;

public interface CustomerService {
    boolean addToCart(Product prodName);
    boolean removeFromCart(Product product);
}
