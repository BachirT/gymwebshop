package com.webshop.gymwebshop.dao;

import com.webshop.gymwebshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

// Elke repository heeft een naam van object nodig en type van de primary key
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
