package code.ch07.ch07_3변수와메서드;

public class ex10_재귀함수_팩토리얼 {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static int factorial(int n) {
		int res = 0;

		if (n == 1 || n == 0) {		// 탈출 조건. 기저 사례
			return 1;
		} 
//		else {
//			res = n * factorial(n - 1); // 자기 자신을 호출
//		}
		//이 아래처럼 하는게 좋음 else문을 안쓰는게 좋다~/
		res = n * factorial(n - 1);
		
		return res;
	}
}