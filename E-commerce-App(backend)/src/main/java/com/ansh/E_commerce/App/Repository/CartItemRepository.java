package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.Cart;
import com.ansh.E_commerce.App.Modal.CartItem;
import com.ansh.E_commerce.App.Modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}