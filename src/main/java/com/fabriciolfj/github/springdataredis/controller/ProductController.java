package com.fabriciolfj.github.springdataredis.controller;

import com.fabriciolfj.github.springdataredis.entity.Product;
import com.fabriciolfj.github.springdataredis.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product findById(@PathVariable("id") int id) {
        return productRepository.findProductById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteByProduct(@PathVariable("id") int id) {
        return productRepository.deleteProduct(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
