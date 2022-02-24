package com.phinakabemba.ecommerce.dao;

import com.phinakabemba.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
