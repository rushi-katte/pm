package com.example.American_Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.American_Product.Service.Services;
import com.example.American_Product.model.Product;
@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private Services ss;

	@PostMapping("/api/products")
	public Product createProduct(@RequestBody Product product) {
		return ss.saveProduct(product);
	}

	@GetMapping("/{id}")
	public Product producbyid(@PathVariable Long id) {
		return ss.getById(id);
	}

	@GetMapping("/")
	public List<Product> getAll() {
		return ss.getAll();

	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		ss.deleteById(id);
	}
    
	@PutMapping("/{id}")
	public Product update(@PathVariable Long id, @RequestBody Product product) {
		return ss.updateById(id, product);
	}
}
