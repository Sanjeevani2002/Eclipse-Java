package com.tnsif.Day_7.polymorphism;

public class ShapeDemo {
 public static void main(String[] args) {
	 //array of shape class
	 shape[] shapes = new shape[2];
	 //instantiate object of circle,square
	  shapes[0] =new Circle(5.0);
	  shapes[1]=new Square(6.0);
	 
	  
	  for(shape sh:shapes) {
		   sh.draw();
		   sh.Erase();
		   System.out.println("-----------------------");
	  }
	  
	  shape s = new shape();
	  s.draw();
	  
	  Circle c = new Circle(2.2);
	  c.draw();
	  
 }
}
