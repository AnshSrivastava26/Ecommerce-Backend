package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
