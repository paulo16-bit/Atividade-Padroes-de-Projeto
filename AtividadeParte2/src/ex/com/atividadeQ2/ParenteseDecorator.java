package ex.com.atividadeQ2;

class ParenteseDecorator extends NumeroDecorator {
    public ParenteseDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public String imprimir() {
        return "(" + numero.imprimir() + ")";
    }
}