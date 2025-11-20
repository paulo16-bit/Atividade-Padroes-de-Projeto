package ex.com.atividade;

public interface ContatoBuilder {
    void setNome(String nome);
    void setEndereco(String endereco);
    void setTelefone(String telefone);
    void setEmail(String email);
    Contato build();
}

