package com.sales.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sales.demo.Models.Users;
import com.sales.demo.Models.Users;
import com.sales.demo.repo.UsersRepo;
import com.sales.demo.repo.UsersRepo;

import antlr.collections.List;

@RestController
public class HomeController {
	
	@Autowired
	UsersRepo repo;
	
	@GetMapping(value ="/")
	public String index() {
		return "Welcome";
	}
	
	@PostMapping(value ="/login/{userid}/{password}")
	public String login(@PathVariable int userid,@PathVariable String password) {
		Users user = repo.findById(userid).get();
		System.out.print(user);
		String name = user.getUsername();
		String pswrd = user.getPassword();
		System.out.println("///"+pswrd);
		System.out.println(password);
		System.out.println(pswrd.getClass().getSimpleName());
		System.out.println(password.getClass().getSimpleName());
		if(pswrd == password) {
			return "Successfully Logged in! "+name;
		}
		else {
			return "Provide correct id or password "+name;
		}	
	}
	
	@GetMapping(value = "/listUsers")
    public Iterable<Users> getuserloyees() {
    	return repo.findAll();
    }

	@PostMapping(value = "/addUser")
	public String addUser(@RequestBody Users user) {
		repo.save(user);
		return "User is added!";
	}
	
	@GetMapping(value = "/getUser/{userid}")
	public Users getUser(@PathVariable int userid) {
		Users user = repo.findById(userid).get();
		return user;
	}
	
	@PutMapping(value = "/update/{userid}")
	public String updateUser(@PathVariable int userid, @RequestBody Users user) {
		Users userUpdate = repo.findById(userid).get();
		userUpdate.setUsername(user.getUsername());
		userUpdate.setUsername(user.getUsername());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setEmail(user.getEmail());
		userUpdate.setCategory(user.getCategory());
		repo.save(userUpdate);
		return "User is updated successfully!";
	}
    
	@DeleteMapping(value = "/delete/{userid}")
	public String deleteuserloyee(@PathVariable int userid) {
		Users user = repo.findById(userid).get();
		repo.delete(user);
		return "User is deleted successfully!";
	}
}
