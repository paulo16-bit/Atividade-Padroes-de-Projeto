package ex.com.atividade;

public class SUVBuilder extends CarBuilder {

    @Override
    protected void buildChassis() {
        car.setChassis("Chassi reforçado de SUV");
    }

    @Override
    protected void installEngine() {
        car.setEngine("Motor 2.4 turbo");
    }

    @Override
    protected void setupFeatures() {
        car.setFeatures("Tração 4x4, bancos de couro, multimídia avançada");
    }
}
