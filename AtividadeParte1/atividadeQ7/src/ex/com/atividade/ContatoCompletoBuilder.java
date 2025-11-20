package ex.com.atividade;

public class ContatoCompletoBuilder implements ContatoBuilder {

    private Contato contato = new Contato();

    @Override
    public void setNome(String nome) {
        contato.nome = nome;
    }

    @Override
    public void setEndereco(String endereco) {
        contato.endereco = endereco;
    }

    @Override
    public void setTelefone(String telefone) {
        contato.telefone = telefone;
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

