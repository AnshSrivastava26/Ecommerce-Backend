package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Domain.PayoutsStatus;
import com.ansh.E_commerce.App.Modal.Payouts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayoutsRepository extends JpaRepository<Payouts,Long> {
    List<Payouts> findPayoutsBySellerId(Long sellerId);
    List<Payouts> findAllByStatus(PayoutsStatus status);
}
