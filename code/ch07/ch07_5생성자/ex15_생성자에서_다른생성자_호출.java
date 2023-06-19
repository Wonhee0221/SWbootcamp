package code.ch07.ch07_5생성자;

class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4);
	}

	Car2(String color) {
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}

public class ex15_생성자에서_다른생성자_호출 {
	public static void main(String args[]) {
//		생성자
//		인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
//		변수 초기화 작업에 주로 이용됨
//		클래스 내에 선언 되고, 메서드와 유사하지만 리턴값이 없음
//		생성자도 오버로딩이 가능
		
//		생성자의 조건
//		1. 생성자의 이름은 클래스의 이름과 같아야 한다
//		2. 생성자는 리턴 값이 없다.
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
