package com.ansh.E_commerce.App.Repository;


import com.ansh.E_commerce.App.Modal.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
    PaymentOrder findByPaymentLinkId(String paymentId);
}
