package com.barry.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Barry23 extends JFrame{
	private JButton b1, b2, b3;
	
	public Barry23() {
		super("我的視窗程式");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Barry23();
	}
}
