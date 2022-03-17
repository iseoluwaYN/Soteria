package com.shop.soteria.data.service.productService;

import com.shop.soteria.data.dto.ProductDto;
import com.shop.soteria.data.model.Product;
import com.shop.soteria.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {

    }

    private void validateProduct(Product product){
        if(product.getName().isBlank() || product.getName().isEmpty() || product.getName() == null){

        }
        if(product.getDescription().isBlank() || product.getDescription().isEmpty()
                || product.getDescription() == null){
        }

        if (product.getPrice() < 0 || product.getPrice() == 0){

        }
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.getById(id) ;
    }

    @Override
    public void deleteProduct(Long id) {
        Product deleteProduct = getProduct(id);
        productRepository.delete(deleteProduct);
    }

    @Override
    public ProductDto updateProduct() {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public List<Product> getAllProduct(Long merchantNo) {
        return null;
    }
}
