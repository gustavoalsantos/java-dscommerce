package com.gustavoalsantos.dscommerce.repositories;

import com.gustavoalsantos.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
