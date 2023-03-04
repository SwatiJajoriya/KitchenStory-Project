package com.example.demo.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Admin;
import com.example.demo.Service.AdminDAO;



@RestController
public class AdminRestController {
	@Autowired
	AdminDAO dao;
	
	
	
	@PostMapping("/insertadminbypostman")
	public Admin insert(@RequestBody Admin e) {
		return dao.insert(e);
	}
	
	
	@PostMapping("/insertalladmin")
	public List<Admin> insertall(@RequestBody List<Admin> ad){
		return dao.insertAll(ad);
	}
	
	@DeleteMapping("/deleteadmin")
	public void deletebyid(Admin a) {
		dao.delete(a);
	}
}
