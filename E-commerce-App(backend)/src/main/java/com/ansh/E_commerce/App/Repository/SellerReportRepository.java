package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.SellerReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerReportRepository extends JpaRepository<SellerReport,Long> {
    SellerReport findBySellerId(Long sellerId);
}

