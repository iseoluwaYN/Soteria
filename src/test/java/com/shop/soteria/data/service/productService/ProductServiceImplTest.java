package com.shop.soteria.data.service.productService;

import com.shop.soteria.data.model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Autowired

    @Test
    void productCanBeCreatedTest(){
        Product product = new Product();
        product.setName("polaroid camera");
        product.setPrice(50000.00);
        product.setDescription("camera");


    }
}