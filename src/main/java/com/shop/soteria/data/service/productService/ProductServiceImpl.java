package com.shop.soteria.data.service.productService;

import com.shop.soteria.data.dto.ProductDto;
import com.shop.soteria.data.model.Product;
import com.shop.soteria.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        validateProduct(product);
        productRepository.save(product);
    }

    private void validateProduct(Product product){
        if(product.getName().isBlank() || product.getName().isEmpty() || product.getName() == null){
                throw new IllegalArgumentException("Complete product details");
        }
        if(product.getDescription().isBlank() || product.getDescription().isEmpty()
                || product.getDescription() == null){
            throw new IllegalArgumentException("Complete product details");
        }
        if (product.getPrice() < 0 || product.getPrice() == 0){
            throw new IllegalArgumentException("Complete product details");
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
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProduct(Long merchantNo) {
        return productRepository.getProductsByMerchantId(merchantNo);
    }
}
