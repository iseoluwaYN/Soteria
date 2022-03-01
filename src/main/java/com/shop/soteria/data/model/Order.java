package com.shop.soteria.data.model;

import com.shop.soteria.data.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Order {

    private Status status;
    private double total;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
}
