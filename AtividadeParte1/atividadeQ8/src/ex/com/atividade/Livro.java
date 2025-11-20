package ex.com.atividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Livro {

    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    private Livro() {

    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }

    public static class LivroBuilder {

        private Livro livro;

        public LivroBuilder(String nomeNacional) {
            livro = new Livro();
            livro.nomeNacional = nomeNacional;
        }

        public LivroBuilder publicadoEm(int ano) {
            livro.ano = ano;
            return this;
        }

        public LivroBuilder dosAutores(String... autores) {
            livro.autores = new ArrayList<>(Arrays.asList(autores));
            return this;
        }

        public LivroBuilder edicao(int edicao) {
            livro.edicao = edicao;
            return this;
        }

        public LivroBuilder cidade(String cidade) {
            livro.cidade = cidade;
            return this;
        }

        public LivroBuilder editora(String editora) {
            livro.editora = editora;
            return this;
        }

        public LivroBuilder nomeOriginal(String nomeOriginal) {
            livro.nomeOriginal = nomeOriginal;
            return this;
        }

        public LivroBuilder tradutores(String... tradutores) {
            livro.tradutores = new ArrayList<>(Arrays.asList(tradutores));
            return this;
        }

        public LivroBuilder paginas(int paginas) {
            livro.paginas = paginas;
            return this;
        }

        public LivroBuilder isbn(long isbn) {
            livro.isbn = isbn;
            return this;
        }

        public Livro build() {
            return livro;
        }
    }
}

