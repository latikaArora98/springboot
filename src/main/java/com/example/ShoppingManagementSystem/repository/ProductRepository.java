package com.example.ShoppingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingManagementSystem.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
