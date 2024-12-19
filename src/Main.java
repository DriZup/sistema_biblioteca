import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
