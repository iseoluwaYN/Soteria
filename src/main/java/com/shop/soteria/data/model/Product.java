package com.shop.soteria.data.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private double price;
    private Long merchantNo;
}
