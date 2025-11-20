package ex.com.atividade;

public class Contato {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

