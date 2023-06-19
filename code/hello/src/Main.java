package code.hello.src;

import java.util.Arrays;
import java.util.Scanner;
class Car{
    int id; //클래스 멤버변수
    int speed; //클래스 멤버변수
    static int width; //클래스 변수
    //static의 얘는 모든거 다 프린트할때 다나옴, 이게 무슨의미?
    //객체가 생성이되는 안되는 어느거에도 다 나오기때문에 이거 쓸때 조심해야함.

    void study(){
        System.out.println("방가윤 실망이야!!!");
    }
    void  nonReturn(int x,int y){
        int z = x + y;
    }

}

public class Main{
//    static int add(int x, int y){
//        x *= 10;
//        System.out.println(x);
//        return x+y;
//    }
    public static void main(String[] args){
//        Car car1 = new Car();
//        int x = 5;
//        int y = 6;
//        System.out.println(add(x,y));
//
//        System.out.println(x);
//        add(x,y);
        Ref ref = new Ref();
        System.out.println(ref.x);
        change(ref);
        System.out.println(ref.x);
    }
    static void change(Ref ref){
        ref.x=10;
        System.out.println(ref.x);
    }
}