package ex.com.atividade;

public class Car {

    private String chassis;
    private String engine;
    private String features;

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Car {" +
                "chassis='" + chassis + '\'' +
                ", engine='" + engine + '\'' +
                ", features='" + features + '\'' +
                '}';
    }
}

