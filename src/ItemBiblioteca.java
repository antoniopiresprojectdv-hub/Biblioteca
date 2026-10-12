
public abstract class ItemBiblioteca {

    private String titulo;
    private int codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;

    }

    public int getCodigo() {
        return codigo;

    }

    public boolean isDisponivel() {
        return disponivel;

    }

    public boolean Emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean Devolver() {
        if (!disponivel) {
            disponivel = true;
            return true;

        } else {
            return false;
        }
    }

    public abstract void ExibirInformacoes();
}