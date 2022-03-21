package com.shop.soteria.data.model;

import com.shop.soteria.data.enums.Roles;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Roles role;
}
