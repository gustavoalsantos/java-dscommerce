package com.gustavoalsantos.dscommerce.services;

import com.gustavoalsantos.dscommerce.dto.ProductDTO;
import com.gustavoalsantos.dscommerce.entities.Product;
import com.gustavoalsantos.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl());
    }
}
