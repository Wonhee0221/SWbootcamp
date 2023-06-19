package ch06_배열.문제;

import java.util.Arrays;
import java.util.Scanner;

public class 문제5 {
	/*
	 * 알파벳 소문자로 된 단어를 입력 받고 알파벳이 몇번씩 나왔는지 출력하시오. 
	 * 나오지 않은 알파벳은 출력하지 않는다.
	 * 출력 순서는 a부터 z까지 사전순으로 한다.
	 * 
	 * ex)
	 * 
	 * input
	 * apple
	 * 
	 * output
	 * a:1개
	 * e:1개
	 * l:1개
	 * p:2개
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] cnt = new int['z' - 'a' + 1];
		
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] == 0) {
				continue;
			}
//			System.out.printf("%c:%d개\n", 'a' + i, cnt[i]);
			System.out.println((char)(i + 'a') + ":" + cnt[i] + "개");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
