package ex.com.atividade;

public abstract class CarBuilder {

    protected Car car = new Car();

    // Template Method – define o processo fixo
    public final Car buildCar() {
        buildChassis();
        installEngine();
        setupFeatures();
        return car;
    }

    // Métodos a serem customizados pelos builders concretos
    protected abstract void buildChassis();
    protected abstract void installEngine();
    protected abstract void setupFeatures();
}

