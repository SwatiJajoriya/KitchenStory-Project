package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.POJO.Purchase;

public interface PurchaseRepo  extends JpaRepository<Purchase, Integer> {

}
