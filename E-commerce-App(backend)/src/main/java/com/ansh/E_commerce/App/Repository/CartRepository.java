package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
