package ch07.ch07_3변수와메서드;

import java.util.Scanner;

public class ex05_메서드 {
	public static void main(String args[]) {
		MyMath myMath = new MyMath();

		System.out.println("add(5, 3) = " + myMath.add(5, 3));
		
		int res = myMath.sub(5, 3);
		System.out.println("sub(5, 3) = " + myMath.sub(5, 3));
		
	}
	
}

class MyMath {
	int add(int a, int b) {
		int result = a + b;
		return result;
	}

	int sub(int a, int b) {
		return a - b;
	}
}