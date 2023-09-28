package com.onlineshoppy.controller;

import java.util.List;
import com.onlineshoppy.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoppy.model.Laptop;

@RestController
public class ShoppingController {

	@Autowired
	ShoppingService service;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops")
	public List<Laptop> getAlllaptops() {
		return service.getAlllaptops();
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops/{id}")
	public Laptop getLaptop(@PathVariable int id) {
		
		return service.getLaptop(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/laptops")
	public String addLaptop(@RequestBody Laptop l1) {
		
		return service.addLaptop(l1);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/laptops/{id}")
	public void updateLaptop(@RequestBody Laptop l2, @PathVariable int id) {
		service.updateLaptop(id, l2);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/laptops/{id}")
	public void deleteLaptop(@PathVariable int id) {
		service.deleteLaptop(id);
	}
	
	
}
