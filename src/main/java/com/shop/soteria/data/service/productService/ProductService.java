package com.shop.soteria.data.service.productService;

import com.shop.soteria.data.dto.ProductDto;
import com.shop.soteria.data.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    Product getProduct(Long id);
    void deleteProduct(Long id);
    ProductDto updateProduct();
    List<Product> getAllProduct();
    List<Product> getAllProduct(Long merchantNo);
}
