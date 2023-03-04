package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.POJO.Admin;



public interface AdminRepo extends JpaRepository<Admin, Integer>{
@Query("Select a.apassword from Admin a where a.ausername=?1")
	public String getPassword(String ausername);
@Query("Select a.aid from Admin a where a.ausername=?1")
public int getId(String ausername);
}