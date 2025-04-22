package com.example.American_Product.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.American_Product.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
