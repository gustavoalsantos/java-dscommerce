package com.gustavoalsantos.dscommerce.repositories;

import com.gustavoalsantos.dscommerce.entities.Order;
import com.gustavoalsantos.dscommerce.entities.User;
import com.gustavoalsantos.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
