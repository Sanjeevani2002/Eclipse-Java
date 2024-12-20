package com.tnsif.Day_6.staticblockmethod;

public class Class {
	private int section;
    private static int srNo;

static
{
	System.out.println("-----------Staic block data-------------------");
	srNo= 1000;	
}
public void data()
{
	System.out.println("---------- Non Static Method----------");
}
Class(){
	System.out.println("--------Default Constructor-------------------");
	srNo++;
	section++;
}

@Override
public String toString() {
	return "Class [section=" + section + "]";
}

static void display()
{
	System.out.println("Serial No "+ srNo);
}

}