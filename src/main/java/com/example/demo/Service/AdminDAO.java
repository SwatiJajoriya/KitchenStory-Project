package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Admin;
import com.example.demo.Repository.AdminRepo;


@Service
public class AdminDAO {
@Autowired
AdminRepo arepo;

public Admin insert(Admin a) {
	return arepo.save(a);
}
public int getId(String ausername) {
	return arepo.getId(ausername);
}
public List<Admin> insertAll(List<Admin> a) {
	return arepo.saveAll(a);
}
public String delete(Admin a) {
	arepo.delete(a);
	return "Deleted!!";
}
public List<Admin> findAllAd(){
	return arepo.findAll();
}
public Admin updatePass(Admin a) {
	Admin aa=arepo.findById(a.getAid()).orElse(null);
	aa.setAusername(a.getAusername());
	aa.setApassword(a.getApassword());
	return arepo.save(aa);
}
public String getPassword(String ausername) {
	return arepo.getPassword(ausername);
}
}