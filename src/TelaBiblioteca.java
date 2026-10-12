
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaBiblioteca extends JFrame {

    public TelaBiblioteca() {

        setTitle("Sistema Biblioteca");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel labelTitulo = new JLabel("Título: ");
        JTextField CampoTitulo = new JTextField();

        JLabel labelCodigo = new JLabel("Código: ");
        JTextField CampoCodigo = new JTextField();

        JLabel labelAutor = new JLabel("Autor: ");
        JTextField CampoAutor = new JTextField();

        JLabel labelPaginas = new JLabel("Número de paginas: ");
        JTextField CampoPaginas = new JTextField();

        JButton botaoCadastrar = new JButton("Cadastrar: ");

        panel.add(labelTitulo);
        panel.add(CampoTitulo);

        panel.add(labelCodigo);
        panel.add(CampoCodigo);

        panel.add(labelAutor);
        panel.add(CampoAutor);

        panel.add(labelPaginas);
        panel.add(CampoPaginas);

        panel.add(botaoCadastrar);

        add(panel);
        revalidate();
        repaint();
        setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> new TelaBiblioteca());

    }
}
