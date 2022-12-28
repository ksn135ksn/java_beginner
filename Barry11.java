package com.barry.java;

public class Barry11 {
	public static void main(String[] args) {
		
//		for(int i = 0;i < 10;i++) {
//			System.out.println(i);
//		}
		
//		int i = 0;
//		for( ;i < 10;) {
//			System.out.println(i++);
//		}
		
		int i = 0;
		for( printBarry() ;i < 10;printLine()) {
			System.out.println(i++);
		}
	}
	
	static void printBarry() {
		System.out.println("Barry");
	}
	static void printLine() {
		System.out.println("---");
	}
}
