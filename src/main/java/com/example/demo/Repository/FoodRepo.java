package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.POJO.Food;

public interface FoodRepo extends JpaRepository<Food,Integer>{

	
//query for restcontroller
	@Query("select f.fname from Food f where f.fname=?1 and f.fid=?2")
	public String findByname(String name,int id);
	
	//Search query for main controller
			@Query("SELECT f from Food f WHERE f.fname LIKE %?1%"
					     +"OR f.fcategory LIKE %?1%")
		public List<Food> findAll(String Keyword);
			
}
