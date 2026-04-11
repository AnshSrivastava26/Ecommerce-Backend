package com.ansh.E_commerce.App.Repository;

import com.ansh.E_commerce.App.Modal.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findBySellerId(Long sellerId);
}
