package ex.com.atividade;

public class ContatoTelefoneBuilder implements ContatoBuilder {

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
        contato.telefone = telefone;
    }

    @Override
    public void setEmail(String email) {
        // não utilizado
    }

    @Override
    public Contato build() {
        return contato;
    }
}
