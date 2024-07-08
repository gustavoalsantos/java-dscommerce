package com.gustavoalsantos.dscommerce.services;

import com.gustavoalsantos.dscommerce.dto.OrderDTO;
import com.gustavoalsantos.dscommerce.dto.ProductDTO;
import com.gustavoalsantos.dscommerce.entities.Order;
import com.gustavoalsantos.dscommerce.repositories.OrderRepository;
import com.gustavoalsantos.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
