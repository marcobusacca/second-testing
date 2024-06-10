package com.advancia;

public class Calculator {

	public int sum(int a, int b) {
		System.out.println("effettuo la somma");
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
	
	public int division(String a, int b) {
		return Integer.parseInt(a) / b;
	}
}
