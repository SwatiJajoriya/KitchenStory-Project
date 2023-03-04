package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.BankDetails;
import com.example.demo.Repository.BankRepo;


@Service
public class BankDAO {
@Autowired
BankRepo brepo;

public List<BankDetails> insertAll(List<BankDetails> bd) {
	return brepo.saveAll(bd);
}

public BankDetails insert(BankDetails bd) {
	return brepo.save(bd);
}

public long getBalance(int bid) {
	return brepo.getBalance(bid);
}
}