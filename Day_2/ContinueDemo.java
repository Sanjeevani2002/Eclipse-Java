package com.tnsif.Day_2;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int k=5; k<15; k++)
		{
			// odd numbers are skipped
			if(k%2 != 0)
			{
				continue;
			}
			// even numbers are printed
			System.out.println(k+ " ");
		}

	}
		// TODO Auto-generated method stub

}


