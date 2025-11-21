package ex.com.atividade;

public abstract class CarBuilder {

    protected Car car = new Car();

    public final Car buildCar() {
        buildChassis();
        installEngine();
        setupFeatures();
        return car;
    }
    protected abstract void buildChassis();
    protected abstract void installEngine();
    protected abstract void setupFeatures();
}


