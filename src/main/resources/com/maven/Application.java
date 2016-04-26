package com.maven;

public class Application {
	
	public Application(){
		System.out.println("Hello World!----+++");
	}
	public static void main(String[] args) {
		System.out.println("Hello World!--------");
		Integer i = sum(4,5);
	}
	public int sum(int a, int b){
		return (a+b);
	}
}
