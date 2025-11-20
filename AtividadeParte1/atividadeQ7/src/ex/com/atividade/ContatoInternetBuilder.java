package ex.com.atividade;

public class ContatoInternetBuilder implements ContatoBuilder {

    private Contato contato = new Contato();

    @Override
    public void setNome(String nome) {
        contato.nome = nome;
    }

    @Override
    public void setEndereco(String endereco) {
        // não utilizado
    }

    @Override
    public void setTelefone(String telefone) {
        // não utilizado
    }

    @Override
    public void setEmail(String email) {
        contato.email = email;
    }

    @Override
    public Contato build() {
        return contato;
    }
}
