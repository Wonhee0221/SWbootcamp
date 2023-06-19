package code.ch07.ch07_6변수의초기화;

//출력되는 순서를 잘봐야한다.
public class ex16_초기화블록 {
	static {	// 클래스 초기화 블록
		System.out.println("static { }");	// 메모리에 로딩 될 때 한번만 수행
	}

	{	// 인스턴스 초기화 블록
		System.out.println("{ }");	// 인스턴스가 생성될 때 마다 수행
	}

	public ex16_초기화블록() {     
		System.out.println("생성자");
	}
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new ex16_초기화블록(); ");
		ex16_초기화블록 bt = new ex16_초기화블록();

		System.out.println("BlockTest bt2 = new ex16_초기화블록(); ");
		ex16_초기화블록 bt2 = new ex16_초기화블록();
	}
}
