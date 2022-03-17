package com.shop.soteria.data.service.productService;

import com.shop.soteria.data.dto.ProductDto;
import com.shop.soteria.data.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct();
    Product getProduct();
    void deleteProduct();
    ProductDto updateProduct();
    List<Product> getAllProduct();
    List<Product> getAllProduct(Long merchantNo);
}
