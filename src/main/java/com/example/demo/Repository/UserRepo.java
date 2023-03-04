package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.POJO.User;



public interface UserRepo extends JpaRepository<User, Integer>{
@Query("Select u.upassword from User u where u.uusername=?1")
	public String userPwd(String uusername);

@Query("Select u.u_fname from User u where u.uusername=?1")
public String findNameByUsrnm(String uusername);

}