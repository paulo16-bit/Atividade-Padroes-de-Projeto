package ex.com.atividadeQ5;

public abstract class Lanchonete {
    public abstract Sanduiche criarSanduiche();

    public void venderSanduiche() {
        Sanduiche s = criarSanduiche();
        s.montar();
    }
}