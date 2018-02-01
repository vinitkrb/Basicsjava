package com.hm.vk.serialization;

import java.io.Serializable;

public class Student implements Serializable
{  
	/**
	 * 
	 */
	private static final long serialVersionUID = -469236258170437448L;
	int id;  
	String name;  
	public Student(int id, String name) 
	{  
	  this.id = id;  
	  this.name = name;  
	}  
	}  