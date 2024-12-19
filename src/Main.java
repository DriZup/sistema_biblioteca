import SistemaBiblioteca.Biblioteca;
import SistemaBiblioteca.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();


        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!\n ");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Exibir livros disponíveis");
            System.out.println("6. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1:Cadastrar livro");
                    System.out.println("Digite o titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o isbn: ");
                    String isbn = sc.nextLine();
                    Livro livro1 = new Livro(titulo,autor,isbn,true);
                    biblioteca.cadastrarLivro(livro1);
                    break;
                case 2:
                    System.out.println("Opção 2: Cadastrar usuario");
                    break;
                case 3:
                    System.out.println("Opção 3: Realizar empréstimo");
                    break;
                case 4:
                    System.out.println("Opção 4: Realizar devolução");
                    break;
                case 5:
                    System.out.println("Opção 5: Exibir livros disponiveis");
                    break;
                case 6:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}
