package com.serialization;

import java.io.Serializable;

public class SerializationAndDeserialization implements Serializable
{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -581325169324059831L;
		public int x = 3;
		transient long y = 4;
		private short z =5;
		int getX()
		{
		return x;
		}
		long gety() 
		{
		return y;
		}
		short getZ()
		{
		return z;
		}
}

