package com.barry.java;

public class Barry18 {
	
	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		int i = 1;
		int sum = 0;
		int TARGET = 100;
		while(i <= TARGET) {
			sum += i; // 1 + 2 + 3 +... + 8 + 9 + 10
			i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n",TARGET,sum);
		System.out.println("-------");
		i = 1; sum = 0;
		for(;i <= TARGET;) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n",TARGET,sum);
	}
}
