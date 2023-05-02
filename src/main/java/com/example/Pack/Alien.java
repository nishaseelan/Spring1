package com.example.Pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

public class Alien {

	public static void main(String[] args) {
//	public void method() {
		ArrayList obj1 = new ArrayList();
		ArrayList obj2 = new ArrayList();
		ArrayList obj3 = new ArrayList();
		
		
		obj1.add("Apple");
		obj1.add("1");
		obj1.add("100000");
		
		obj2.add("Samsung");
		obj2.add("1");
		obj2.add("70000");

		obj3.add("Sony");
		obj3.add("1");
		obj3.add("60000");
		
		Iterator itr = obj1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr = obj2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr = obj3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	

	}
//	
//	private int aid;
//	private String name;
//	private String tech;
//	public int getAid() {
//		return aid;
//	}
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTech() {
//		return tech;
//	}
//	public void setTech(String tech) {
//		this.tech = tech;
//	}
//	
//	public void show() {
//		
//		System.out.println("Hello");
//	}
//	
	
}
