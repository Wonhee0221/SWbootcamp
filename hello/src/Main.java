import java.util.Arrays;
import java.util.Scanner;
class Car{
    int id; //클래스 멤버변수
    int speed; //클래스 멤버변수
    static int width; //클래스 변수
    //static의 얘는 모든거 다 프린트할때 다나옴, 이게 무슨의미?
    //객체가 생성이되는 안되는 어느거에도 다 나오기때문에 이거 쓸때 조심해야함.

    void study(){
        System.out.println("study!!!");
    }
}

public class Main{
    public static void main(String[] args){
        Car car= new Car();
        car.id =1;
        car.speed=10;

        Car car2 = new Car();
        car2.id =2;
        car2.speed=10;

        car.width = 5;

        System.out.println(car.id);
        System.out.println(car.width);
        System.out.println(car2.width);


    }
}