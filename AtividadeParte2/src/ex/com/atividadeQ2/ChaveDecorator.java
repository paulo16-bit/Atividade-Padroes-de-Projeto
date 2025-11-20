package ex.com.atividadeQ2;

class ChaveDecorator extends NumeroDecorator {
    public ChaveDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public String imprimir() {
        return "{" + numero.imprimir() + "}";
    }
}
