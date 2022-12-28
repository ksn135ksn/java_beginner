package com.barry.java;

public class Barry99 {
	public static void main(String[] args) {
//		for(int j = 1;j <= 9;j++) {
//			for(int i = 2; i<= 5;i++) {
//				int r = i * j;
//				System.out.printf("%d x %d = %d\t", i, j, r);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int j = 1;j <= 9;j++) {
//			for(int i = 6; i<= 9;i++) {
//				int r = i * j;
//				System.out.printf("%d x %d = %d\t", i, j, r);
//			}
//			System.out.println();
//		}
		
//		for(int k = 0;k < 2;k++) {
//			for(int j = 1;j <= 9;j++) {
//				for(int i = 2; i<= 5;i++) {
//					int newi = i + k * 4;
//					int r = newi * j;
//						System.out.printf("%d x %d = %d\t", newi, j, r);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		final int ROW = 1;
		final int START = 1;
		final int COL = 9;
		
		for(int k = 0;k < ROW;k++) {
			for(int j = 1;j <= 9;j++) {
				for(int i = START;i < START + COL ;i++) {
					int newi = i + k*COL;
					int r = newi * j;
					System.out.printf("%d x %d = %d\t", newi ,j,r);
				}
				System.out.println();
			}
			System.out.println("----");
		}
	}
}
