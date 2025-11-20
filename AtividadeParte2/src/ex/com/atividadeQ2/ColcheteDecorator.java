package ex.com.atividadeQ2;

class ColcheteDecorator extends NumeroDecorator {
    public ColcheteDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public String imprimir() {
        return "[" + numero.imprimir() + "]";
    }
}