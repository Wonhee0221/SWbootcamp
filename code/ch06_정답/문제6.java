package ch06_배열.문제;

public class 문제6 {
//	1	2	3	4	5
//		6	7	8
//			9
//		10	11	12
//	13	14	15	16	17
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int x = 0;
		int cnt = 1;
		
		for (int i = 0; i < 5; i++) {
			// 시작위치. 탭이 첫줄은 0개, 둘째줄은 1개, 2, 3, 4
			for(int j = 0; j < x; j++) {
				System.out.print("\t");
			}	// end of for j
			
			// 탭의 개수와 숫자의 개수의 합은 5.
			for (int j = x; j < 5 - x; j++) {
				System.out.printf("%2d\t", cnt++);
			}	// end of for
			
			// 중간지점 확인. 2보다 작으면 탭이 늘어나고 2보다 크면 줄어듬.
			if (i < 2) x++;
			else x--;
			
			System.out.println();
		}	// end of for
	}
}
