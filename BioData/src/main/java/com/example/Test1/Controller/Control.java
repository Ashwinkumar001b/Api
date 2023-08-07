package com.example.Test1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test1.Entity.UserEntity;
import com.example.Test1.Repositary.Repo;

@RestController
public class Control {
	@Autowired
	public Repo rep;
	
@PostMapping("/add")
public UserEntity adduser (@RequestBody UserEntity ue) {
	try {
	rep.save(ue);
	return ue;
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return ue;
}
@GetMapping("/getall")
public List<UserEntity> getall(){
	try {
	return rep.findAll();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return null;
}
@GetMapping("/get/{Id}")
public Optional<UserEntity> one(@PathVariable int Id){
	try {
	return rep.findById(Id);
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return null;
}
@SuppressWarnings("deprecation")
@DeleteMapping("/getdel/{Id}")
public String del (@PathVariable int Id) {
	try {
	UserEntity ue=rep.getOne(Id);
	rep.delete(ue);
	return "delete";
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return null;
}
@PutMapping("/update")
public UserEntity updateuser(@RequestBody UserEntity ue) {
	try {
	rep.save(ue);
	return ue;
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return ue;
}
}
