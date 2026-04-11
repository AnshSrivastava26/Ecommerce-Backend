package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String couponCode);
}
