package com.priya.java;

public class Source4 
{  
	public static void main(String args[] ) throws Exception 
	{   
		Mobile obj = new Mobile();        
		System.out.println(obj.addMobile("Apple", "iphone13"));         
		System.out.println(obj.getModels("Vivo"));         
		System.out.println(obj.buyMobile("Apple", "iphone13"));   
	} 
}
