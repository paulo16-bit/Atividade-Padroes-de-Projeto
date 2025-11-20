package ex.com.atividade;

public class CarDirector {

    public Car construct(CarBuilder builder) {
        return builder.buildCar();
    }
}
