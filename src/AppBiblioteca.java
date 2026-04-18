import java.util.InputMismatchException;
import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorBiblioteca gb = new GerenciadorBiblioteca();
        
        int opcao = 0;

        do {
            System.out.println("\nBem-vindo ao Gerenciador de Biblioteca!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Emprestar Livro");
            System.out.println("5. Devolver Livro");
            System.out.println("6. Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // limpar buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                sc.nextLine(); // limpar entrada incorreta
                continue; // volta ao início do loop
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite o ID do livro: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.print("Digite o ano do livro: ");
                    String ano = sc.nextLine();
                    System.out.print("Digite a editora do livro: ");
                    String editora = sc.nextLine();
                    System.out.print("Digite o usuário do livro: ");
                    String usuario = sc.nextLine();
                    System.out.println(gb.AdcionarLivro(titulo, id, autor, ano, editora, usuario));
                    break;

                case 2:
                    System.out.print("Digite o ID do livro a ser removido: ");
                    int idRemover = sc.nextInt();
                    System.out.println(gb.RemoverLivro(idRemover));
                    break;

                case 3:
                    System.out.println("Lista de Livros:");
                    gb.ListarLivros();
                    break;

                case 4:
                    System.out.print("Digite o ID do livro a ser emprestado: ");
                    int idEmprestar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o nome do usuário: ");
                    String usuarioEmprestar = sc.nextLine();
                    System.out.println(gb.EmprestimoLivro(idEmprestar, usuarioEmprestar));
                    break;

                case 5:
                    System.out.print("Digite o ID do livro a ser devolvido: ");
                    int idDevolver = sc.nextInt();
                    System.out.println(gb.DevolucaoLivro(idDevolver));
                    break;

                case 6:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 6);

        sc.close();
    }
}
