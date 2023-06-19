package ch06_배열.문제;

import java.util.Arrays;
import java.util.Scanner;

public class 문제4 {
	/*
	 * [1, 2, 3, 4, 5] 배열을 오른쪽으로 두 칸씩 회전시킨 배열을 저장하고 출력하시오.
	 * 
	 * ex)
	 * [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] arr2 = new int[arr.length];
		int move = 2;
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[(arr.length - move + i) % arr.length];
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
