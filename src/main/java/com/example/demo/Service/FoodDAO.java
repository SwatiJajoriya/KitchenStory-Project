package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Food;
import com.example.demo.Repository.FoodRepo;

@Service
public class FoodDAO {

	@Autowired
	FoodRepo frepo;
	
	public Food insertfood(Food f) {
		
		return frepo.save(f);
		}

	public List<Food> insertallfood(List<Food> f){
		return frepo.saveAll(f);
		
	}

	public List<Food> getallfood(){
		return frepo.findAll();
	}

	public void deletefoodbyid(int id){
		frepo.deleteById(id);
	}

	public Food updatefood(Food f) {
		Food food =frepo.findById(f.getFid()).orElse(null);
		food.setFname(f.getFname());
		food.setFcategory(f.getFcategory());
		food.setFprice(f.getFprice());
		food.setFimage(f.getFimage());
		return	frepo.save(food);
		
	}

	public void deletefood(Food f) {
		frepo.delete(f);

		
	}
	
	//customize query
			public String findfoodbyname(String name,int id){
			return frepo.findByname(name,id);
			}
			
	// for search
	public List<Food> listAll(String keyword){
		if(keyword!=null) {
			return frepo.findAll(keyword);
		}
	return null;
	}
	
	
}
