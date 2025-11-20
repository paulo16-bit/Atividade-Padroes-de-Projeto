package ex.com.atividade;

public class SportsCarBuilder extends CarBuilder {

    @Override
    protected void buildChassis() {
        car.setChassis("Chassi esportivo ultraleve");
    }

    @Override
    protected void installEngine() {
        car.setEngine("Motor V8 de alta performance");
    }

    @Override
    protected void setupFeatures() {
        car.setFeatures("Bancos esportivos, suspensão baixa, painel premium");
    }
}

