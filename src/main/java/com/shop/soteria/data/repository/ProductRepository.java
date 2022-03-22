package com.shop.soteria.data.repository;

import com.shop.soteria.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByMerchantNo(Long merchantNo);
}
