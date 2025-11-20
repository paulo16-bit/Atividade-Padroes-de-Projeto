package ex.com.atividadeQ2;

abstract class NumeroDecorator implements Numero {
    protected Numero numero;

    public NumeroDecorator(Numero numero) {
        this.numero = numero;
    }
}