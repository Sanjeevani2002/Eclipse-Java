package com.tnsif.Day_7.polymorphism;

public class Square extends shape{
	private double side;
	public Square(double side)
  {
	  this.side = side;
  }
	@Override
	public void draw()
	{
		System.out.println("Draw generic shape"+ side);
	}

	//override erase method for circle
	@Override
	public void Erase() {
		System.out.println("Erase generic shape"+side);
	}
	public void color() {
		System.out.println("Erase generic shape"+side);
	}

}
