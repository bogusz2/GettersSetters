package pl.pb;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine("A1");
        Car car = new Car(engine,"Izera");

        Engine engine1 = car.getEngine();
        engine1.setName("DUPA");

        System.out.println(car.getEngine().getName());
        //DUPA
    }
}
