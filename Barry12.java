package com.barry.java;

import java.util.Scanner;

public class Barry12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入任意整數 判斷其是否為質數");
		
		int target = scan.nextInt();
		boolean isPrime = true;
		for(int i = 2;i < target;i++) {
			if(target % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.printf("%s => %s",target,isPrime? "是" : "否");
	}
}
