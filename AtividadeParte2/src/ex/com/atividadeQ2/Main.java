package ex.com.atividadeQ2;

public class Main {
    public static void main(String[] args) {

        Numero n1 = new NumeroUm();

        Numero comParenteses = new ParenteseDecorator(n1);
        System.out.println(comParenteses.imprimir());

        Numero comColchetes = new ColcheteDecorator(n1);
        System.out.println(comColchetes.imprimir());

        Numero comChaves = new ChaveDecorator(n1);
        System.out.println(comChaves.imprimir());

        Numero combinacao1 = new ChaveDecorator(
                new ColcheteDecorator(
                        new NumeroUm()));
        System.out.println(combinacao1.imprimir());

        Numero combinacao2 = new ChaveDecorator(
                new ColcheteDecorator(
                        new ParenteseDecorator(
                                new NumeroUm())));
        System.out.println(combinacao2.imprimir());
    }
}