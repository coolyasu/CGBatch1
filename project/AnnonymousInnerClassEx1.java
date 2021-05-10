package com.capgemini.collections2;

public class AnnonymousInnerClassEx1 {
	public static void main(String[] args) {
		
//		Greet g = new Greet();//Cannot instantiate the type Greet
		/*
		Greet  g = new Greet() {
			
		};
		//The type new Greet(){} must implement the inherited abstract method Greet.wish(String)
		 
		 */
		//Anonymous class
		Greet g = new Greet() {

			@Override
			public void wish(String s) {
				System.out.println("Hi "+s+" Happy bday");
				
			}
			
		};
		
		g.wish("Yash");
		System.out.println("********************");
		g.wish("Ram");
	}
	
}

interface  Greet {
	void wish(String s) ;
}