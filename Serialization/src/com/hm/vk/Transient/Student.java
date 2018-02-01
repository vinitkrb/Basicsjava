package com.hm.vk.Transient;

import java.io.Serializable;

public class Student implements Serializable
{  
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7608061961229286573L;
	int id;  
	String name;  
	transient int age;//Now it will not be serialized  
	public Student(int id, String name,int age)
	{  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	}  
}