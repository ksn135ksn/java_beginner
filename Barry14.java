package com.barry.java;

public class Barry14 {
	public static void main(String[] args) {
		int d1,d2,d3,d4,d5,d6;
		d1=d2=d3=d4=d5=d6=0;
		
		for(int i = 0;i < 100;i++) {
			int diceNumber = (int)(Math.random()* 6 + 1);
			switch(diceNumber) {
				case 1: d1++; break;
				case 2: d2++; break;
				case 3: d3++; break;
				case 4: d4++; break;
				case 5: d5++; break;
				case 6: d6++; break;
			}
		}
		
		System.out.printf("%d點出現的次數為%d\n",1,d1);
		System.out.printf("%d點出現的次數為%d\n",2,d2);
		System.out.printf("%d點出現的次數為%d\n",3,d3);
		System.out.printf("%d點出現的次數為%d\n",4,d4);
		System.out.printf("%d點出現的次數為%d\n",5,d5);
		System.out.printf("%d點出現的次數為%d\n",6,d6);
	}
}
