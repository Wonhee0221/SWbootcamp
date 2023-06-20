package code.hello.src;

class Car {
    int speed;
    final int id;
    String name;


    public Car(int id){
        this.id = id;
    }

    public Car(int id, int speed) {
        this.speed =3;
        this.id =2;
    }

    @Override
    public String toString(){
        return "Car [speed"+speed+"id"+id+ "]";
    }

    void accelerate(){
        speed++;
    }
    String a;

}
class SportCar extends Car{
    int gear;

    public SportCar(int id, int speed, int gear) {
        super(id,speed);
        this.gear = gear;
    }

    void drive(){
        System.out.println("drive");
    }

    void accelerate(){
        speed +=2;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", id=" + id +
                '}';
    }
}

public class Main{
    public static void main(String[] args){
        SportCar sportCar = new SportCar(4,0,3);
        sportCar.speed =5;
        sportCar.accelerate();
        System.out.println(sportCar);

        final int x = 3;
        System.out.println(x);
    }
}