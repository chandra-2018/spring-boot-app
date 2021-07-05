package com.cpcode.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cpcode.ecommerce.entitiy.Product;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface productRepository extends JpaRepository<Product, Long> {
}
