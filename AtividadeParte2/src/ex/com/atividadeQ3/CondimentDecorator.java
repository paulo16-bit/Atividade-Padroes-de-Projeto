package ex.com.atividadeQ3;

public abstract class CondimentDecorator extends Pizza {
    protected Pizza decoratedPizza;

    public CondimentDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public abstract String getDescription();
}
