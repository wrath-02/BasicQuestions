package com.concept.basics;

public class LargestNumber {

	public static void main(String[] args) {
		int a=2,b=6,c=1;
		if(a>b) {
			if(a>c) System.out.println("a is largest");
			else System.out.println("c is largest");
		}
		else {
			if(b>c) System.out.println("b is largest");
			else System.out.println("c is largest");
			
		}
	}
}
