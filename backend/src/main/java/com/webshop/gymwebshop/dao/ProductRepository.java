package com.webshop.gymwebshop.dao;

import com.webshop.gymwebshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Elke repository heeft een naam van object nodig en type van de primary key
public interface ProductRepository extends JpaRepository<Product, Long> {
}
