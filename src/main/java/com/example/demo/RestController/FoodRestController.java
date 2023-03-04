package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.POJO.Food;
import com.example.demo.Service.FoodDAO;



@RestController
public class FoodRestController {
	

	@Autowired
	FoodDAO fdao;
	
	@PostMapping("/insertfood1")
public Food insertfood(@RequestBody Food f,MultipartFile image) {
		
		return fdao.insertfood(f);
	}
	//insert a list of Food
	@PostMapping("/insertallfood")
	public List<Food> insertallfood(@RequestBody List<Food> f){
		return fdao.insertallfood(f);
	}
	
	@GetMapping("/getallfood")
	public List<Food> getallfood(){
		return fdao.getallfood();
	}
	
	@DeleteMapping("deletefoodbyid/{id}")
	public String deletefoodbyid(@PathVariable("id") int id) {
		fdao.deletefoodbyid(id);
		return "Deleted the id value of "+ id;
	}
	
	@PutMapping("/updatefood1")
	public Food updatefood(@RequestBody Food f) {
		return fdao.updatefood(f);
	}
	
	
	@GetMapping("/getfoodbyname/{name}/{id}")
	public String findbyname(@PathVariable("name") String name,@PathVariable("id") int id) throws Exception{
		if(fdao.findfoodbyname(name, id)!=null) {
			return fdao.findfoodbyname(name, id);
		}
		else {
			throw new Exception("the name and the id is not found");
		}
	}

}



