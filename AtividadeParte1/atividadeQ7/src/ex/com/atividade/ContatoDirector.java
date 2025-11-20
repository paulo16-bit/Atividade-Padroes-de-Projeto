package ex.com.atividade;

public class ContatoDirector {

    public Contato construirContato(
            ContatoBuilder builder,
            String nome,
            String endereco,
            String telefone,
            String email
    ) {
        builder.setNome(nome);
        builder.setEndereco(endereco);
        builder.setTelefone(telefone);
        builder.setEmail(email);
        return builder.build();
    }
}

