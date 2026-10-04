
public class Livro extends ItemBiblioteca {

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int codigo, String autor, int numeroPaginas) {
        super(titulo, codigo);

        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    @Override
    public void ExibirInformacoes() {

        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("disponível: " + isDisponivel());

    }
}