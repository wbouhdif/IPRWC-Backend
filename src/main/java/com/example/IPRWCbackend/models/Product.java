package com.example.IPRWCbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "\"product\"")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column
    private String description;

    @Column
    private String image_path;


    public Product(String name, float price, String description, String image_path) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image_path = image_path;
    }

    public Product() {

    }
}
