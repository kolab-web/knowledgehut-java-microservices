package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestProductsList {
	public static void main(String[] args) {
		Products p1 = new Products(333, "Laptop", 45000);
		Products p2 = new Products(222, "Microwave", 25000);
		Products p3 = new Products(111, "Mobile", 35000);
		Products p4 = new Products(222, "Gyser", 20000);
		
		List<Products> list = new ArrayList<Products>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		System.out.println(list);
		for(Products p : list) {
			String name = p.getName();
			if(name.equals("Mobile")) {
				System.out.println("Mobile found!");
			}
		}
	}
}
