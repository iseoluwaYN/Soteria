package com.shop.soteria.data.model;

import com.sun.istack.NotNull;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
