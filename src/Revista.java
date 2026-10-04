
public class Revista extends ItemBiblioteca {

    private int edicao;
    private String mesPublicacao;

    public Revista(String titulo, int codigo, int edicao, String mesPublicacao) {

        super(titulo, codigo);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;

    }

    @Override
    public void ExibirInformacoes() {

        System.out.println("Titulo: " + getTitulo());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Edição: " + edicao);
        System.out.println("Mês de publicação: " + mesPublicacao);
        System.out.println("Disponivel: " + isDisponivel());

    }
}