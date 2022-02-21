package com.shop.soteria.data.model;

import com.shop.soteria.data.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Status status;
    private double total;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
}
