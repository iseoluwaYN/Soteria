package com.shop.soteria.data.repository;

import com.shop.soteria.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByMerchantId(Long merchantNo);
}
