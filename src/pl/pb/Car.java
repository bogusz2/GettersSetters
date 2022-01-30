package pl.pb;

public class Car {
    private Engine engine;
    private String name;

    public Car(Engine engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }
}
