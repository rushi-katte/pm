package com.example.American_Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.American_Product.Repo.ProductRepo;
import com.example.American_Product.model.Product;

@Service
public class Services {  // Renamed to ProductService for clarity

    @Autowired
    private ProductRepo productRepo;  // Changed repo variable name to match naming conventions

    // Save Product
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    // Get Product by ID
    public Product getById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    // Get All Products
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    // Delete Product by ID
    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    // Update Product by ID
    public Product updateById(Long id, Product product) {
        if (productRepo.existsById(id)) {
            product.setId(id);
            return productRepo.save(product);
        }
        return null;
    }
}
