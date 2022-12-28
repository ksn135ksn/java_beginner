package com.barry.java;

public class Barry15 {
	public static void main(String[] args) {
		int[] p = new int[6];
		
		for(int i = 0;i < 100;i++) {
			int point = (int)(Math.random()* 6 );
			p[point]++;
			}
		
		for(int i = 0;i <p.length;i++) {
			System.out.printf("%d點出現的次數為%d\n",i+1,p[i]);
		}
	}
}

