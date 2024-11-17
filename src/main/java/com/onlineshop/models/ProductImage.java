package com.onlineshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Product product;
    private String imageUrl;
}
