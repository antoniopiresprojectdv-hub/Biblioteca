import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();
        int opc1 = -1;

        while (opc1 != 0) {
            System.out.println("===== SISTEMA BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro.");
            System.out.println("2 - Remover livro ou revista.");
            System.out.println("3 - Listar Livros e Revistas.");
            System.out.println("4 - Buscar livro ou revista.");
            System.out.println("5 - Cadastrar revista.");
            System.out.println("0 - Sair.");
            System.out.println("Escolha uma opçao para continuar: ");
            System.out.println("================================");
            opc1 = entrada.nextInt();
            entrada.nextLine();

            switch (opc1) {
                case 1:
                    System.out.println("===== Cadastrar Livros =====");

                    System.out.println("Digite o titulo do livro: ");
                    String titulo = entrada.nextLine();

                    System.out.println("Digite o codico do livro: ");
                    int codigo = entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Digite o autor do livro: ");
                    String autor = entrada.nextLine();

                    System.out.println("Digite o numero de paginas do livro: ");
                    int numeroPaginas = entrada.nextInt();

                    Livro novoLivro = new Livro(titulo, codigo, autor, numeroPaginas);
                    itens.add(novoLivro);

                    System.out.println("Livro cadatrado com sucesso !!");

                    break;

                case 2:
                    System.out.println("===== Remover Livro =====");

                    if (itens.isEmpty()) {
                        System.out.println("Nenhum item cadastrado!!");
                    } else {
                        for (int i = 0; i < itens.size(); i++) {

                            ItemBiblioteca item = itens.get(i);
                            System.out.println((i + 1) + " - " + item.getTitulo());
                        }

                        System.out.print("Digite o numero do livro que deseja remover da biblioteca: ");
                        int numero = entrada.nextInt();
                        entrada.nextLine();

                        if (numero >= 1 && numero <= itens.size()) {
                            itens.remove(numero - 1);
                            System.out.println("Item removido com sucesso !!");
                        } else {
                            System.out.println("Numero de item invalido!!!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("===== Listar Livros e Revistas =====");

                    if (itens.isEmpty()) {
                        System.out.println("Nenhum item cadastrado !!");
                    } else {

                        System.out.println("Itens cadastrados na biblioteca: ");

                        for (int i = 0; i < itens.size(); i++) {

                            System.out.println("Item " + (i + 1) + ":");

                            ItemBiblioteca intem = itens.get(i);
                            intem.ExibirInformacoes();

                        }
                    }
                    break;

                case 4:
                    System.out.println("===== Buscar Livro =====");

                    if (itens.isEmpty()) {
                        System.out.println("Nenhum item cadastrado!!");
                    } else {
                        System.out.print("Digite o titulo do livro ou revista que deseja buscar na biblioteca:  ");
                        String nomeBusca = entrada.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < itens.size(); i++) {

                            ItemBiblioteca item = itens.get(i);
                            if (item.getTitulo().equalsIgnoreCase(nomeBusca)) {

                                encontrado = true;
                                System.out.println("Livro ou revista encontardo na biblioteca !! ");

                                item.ExibirInformacoes();

                                break;

                            }
                        }

                        if (!encontrado) {
                            System.out.println("Livro nao encontrado na biblioteca !!");
                        }

                    }
                    break;

                case 5:
                    System.out.println("===== Cadastrar Revista =====");

                    System.out.println("Digite o titulo da revista: ");
                    String tituloRevista = entrada.nextLine();

                    System.out.println("Dite o codigo da revista: ");
                    int codigoRevista = entrada.nextInt();

                    System.out.println("Digite a edição da revista: ");
                    int edicaoRevista = entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Digite o mês de publicaçâo da revista: ");
                    String mesPublicacaoRveista = entrada.nextLine();

                    Revista novaRevista = new Revista(
                            tituloRevista,
                            codigoRevista,
                            edicaoRevista,
                            mesPublicacaoRveista);

                    itens.add(novaRevista);
                    System.out.println("Revista cadatrada com sucesso !!");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        entrada.close();
    }
}