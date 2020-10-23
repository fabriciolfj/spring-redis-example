package com.fabriciolfj.github.springdataredis.repository;

import com.fabriciolfj.github.springdataredis.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final RedisTemplate template;
    private static final String HASH_KEY = "Product";

    public Product save(final Product product) {
        template.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;
    }

    public List<Product> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id) {
        return (Product) template.opsForHash().get(HASH_KEY, id);
    }

    public String deleteProduct(int id) {
        template.opsForHash().delete(HASH_KEY, id);
        return "Product deleted.";
    }
}
