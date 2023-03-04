package com.example.demo.POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private long balance;
}