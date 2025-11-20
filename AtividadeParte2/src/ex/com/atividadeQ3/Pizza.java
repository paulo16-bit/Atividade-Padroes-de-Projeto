package ex.com.atividadeQ3;

public abstract class Pizza {
    protected String description = "Pizza Desconhecida";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
