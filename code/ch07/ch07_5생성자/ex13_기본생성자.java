package ch07.ch07_5생성자;

class Data_1 {
	int value;
}

class Data_2 {
	int value;

	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

public class ex13_기본생성자 {
	public static void main(String args[]) {
//		생성자
//		인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
//		변수 초기화 작업에 주로 이용됨
//		클래스 내에 선언 되고, 메서드와 유사하지만 리턴값이 없음
//		생성자도 오버로딩이 가능
		
//		생성자의 조건
//		1. 생성자의 이름은 클래스의 이름과 같아야 한다
//		2. 생성자는 리턴 값이 없다.
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); // compile error발생
		
		Data_2 d2 = new Data_2(3);
		
   }
}
