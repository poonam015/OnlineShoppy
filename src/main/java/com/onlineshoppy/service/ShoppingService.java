package com.onlineshoppy.service;

import java.util.*;
import java.util.List;
import com.onlineshoppy.model.*;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

	private List<Laptop> laptoplist=new ArrayList<> (Arrays.asList(
			new Laptop(101,"Asus Tuf Gaming","i5",56000),
			new Laptop(102,"Lenovo ideapad 330","i5",42000),
			new Laptop(103,"Acer Prodator","i7",72000),
			new Laptop(104,"MSI Gaming Duo","i5",52000)
			));
	
	public List<Laptop> getAlllaptops() {
		return laptoplist;
	}
	
	public Laptop getLaptop(int id) {
		return laptoplist.stream().filter(lap-> lap.getLaptopId()==id).findFirst().get();
	}

	public String addLaptop(Laptop l1) {
		laptoplist.add(l1);
		return "Sucessfully Added";
	}
	
	public void updateLaptop(int id, Laptop l2) {
		int i=0;
		for(i=0;i<laptoplist.size();i++) {
			Laptop lap=laptoplist.get(i);
			
			if(lap.getLaptopId()==id) {
				laptoplist.set(i, l2);
			}
		}
	}
	
	public void deleteLaptop(int id) {
		laptoplist.removeIf(lap->lap.getLaptopId()==id);
	}
}
