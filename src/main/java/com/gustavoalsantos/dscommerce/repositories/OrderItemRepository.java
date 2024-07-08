package com.gustavoalsantos.dscommerce.repositories;

import com.gustavoalsantos.dscommerce.entities.OrderItem;
import com.gustavoalsantos.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
