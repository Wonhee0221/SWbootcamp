package code.ch07.ch07_5생성자;

class Student {
	int id;		
	String name;			

	public Student() {}	// 기본 생성자

	public Student(int i, String n) {	// 매개변수가 있는 생성자
		id = i;
		name = n;
	}
}

public class ex14_매개변수_있는_생성자 {
	public static void main(String args[]) {
//		생성자
//		인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
//		변수 초기화 작업에 주로 이용됨
//		클래스 내에 선언 되고, 메서드와 유사하지만 리턴값이 없음
//		생성자도 오버로딩이 가능
		
//		생성자의 조건
//		1. 생성자의 이름은 클래스의 이름과 같아야 한다
//		2. 생성자는 리턴 값이 없다.
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "김자바";

		Student s2 = new Student(2, "이자바");

		System.out.println("s1의 id=" + s1.id + ", name=" + s1.name);
		System.out.println("s2의 id=" + s2.id + ", name=" + s2.name);
	}
}
