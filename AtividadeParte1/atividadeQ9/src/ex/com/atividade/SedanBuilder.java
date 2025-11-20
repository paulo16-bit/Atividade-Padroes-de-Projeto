package ex.com.atividade;

public class SedanBuilder extends CarBuilder {

    @Override
    protected void buildChassis() {
        car.setChassis("Chassi de Sedan");
    }

    @Override
    protected void installEngine() {
        car.setEngine("Motor 1.8 econômico");
    }

    @Override
    protected void setupFeatures() {
        car.setFeatures("Ar-condicionado, 4 portas, multimídia simples");
    }
}
