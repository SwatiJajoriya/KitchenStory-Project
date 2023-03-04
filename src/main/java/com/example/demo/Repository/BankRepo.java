package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.POJO.BankDetails;

public interface BankRepo extends JpaRepository<BankDetails, Integer> {
	@Query("Select bd.balance from BankDetails bd where bd.bid=?1")
	public long getBalance(int bid);
}