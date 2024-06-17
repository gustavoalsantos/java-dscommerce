package com.gustavoalsantos.dscommerce.repositories;

import com.gustavoalsantos.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
