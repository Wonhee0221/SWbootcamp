package code.ch08.ch08_5다형성;

public class ex11_instanceof {
	public static void main(String args[]) {
		FireEngine2 fe = new FireEngine2();
		Car2 car =new Car2();

		if(car instanceof FireEngine2) { //이런경우는 false를 뱉어냄.
			System.out.println("111111111");
		}

		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine instance.");
		} 

		if(fe instanceof Car2) { //부모클래스니까 출력되는게 맞음
			System.out.println("This is a Car instance.");
		} 

		if(fe instanceof Object) {  //오브젝트는 모든것의 부모클래스니까 당연히 출력이된다.
			System.out.println("This is an Object instance.");
		} 

		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	}
}

class Car2 {} //부모
class FireEngine2 extends Car2 {} //자식