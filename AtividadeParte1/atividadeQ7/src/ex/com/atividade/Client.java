package ex.com.atividade;

public class Client {

    public static void main(String[] args) {

        // Dados de exemplo
        String nome = "João da Silva";
        String endereco = "Rua Central, 123";
        String telefone = "(11) 99999-1234";
        String email = "joao@email.com";

        // Cria o director
        ContatoDirector director = new ContatoDirector();

        // Builders
        ContatoBuilder builderInternet = new ContatoInternetBuilder();
        ContatoBuilder builderTelefone = new ContatoTelefoneBuilder();
        ContatoBuilder builderCompleto = new ContatoCompletoBuilder();

        // Cria os contatos
        Contato contatoInternet = director.construirContato(
                builderInternet, nome, endereco, telefone, email);

        Contato contatoTelefone = director.construirContato(
                builderTelefone, nome, endereco, telefone, email);

        Contato contatoCompleto = director.construirContato(
                builderCompleto, nome, endereco, telefone, email);

        // Exibe os resultados
        System.out.println(contatoInternet);
        System.out.println(contatoTelefone);
        System.out.println(contatoCompleto);
    }
}
