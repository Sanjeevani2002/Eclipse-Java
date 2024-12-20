package com.tnsif.Day_7.polymorphism;

public class Circle extends shape {
	
  private double radius;

public Circle(double radius)
  {
	  this.radius = radius;
  }
  
@Override
public void draw()
{
	System.out.println("Draw generic shape"+radius);
}

//override erase method for circle
public void Erase() {
	System.out.println("Erase generic shape"+radius);
}



}
