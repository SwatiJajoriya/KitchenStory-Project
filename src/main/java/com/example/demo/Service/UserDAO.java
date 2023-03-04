package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.User;
import com.example.demo.Repository.UserRepo;


@Service
public class UserDAO {
@Autowired
UserRepo urepo;

public String findtheName(String uusername) {
	return urepo.findNameByUsrnm(uusername);
}

public String userPwd(String uusername) {
	return urepo.userPwd(uusername);
}
public User insert(User u) {
	return urepo.save(u);
}
public User updatePwd(User u) {
	User uu=urepo.findById(u.getUid()).orElse(null);
	uu.setUpassword(u.getUpassword());
	return urepo.save(uu);
}
public String delete(User u) {
	urepo.delete(u);
	return "Deleted!!";
}
public List<User> getAllUsers(){
	return urepo.findAll();
}
}