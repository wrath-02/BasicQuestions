package com.concept.basics;
import java.util.Scanner;

public class areaofcircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("The area is "+area);
		
		
	}

}
