package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    public void realizarEmprestimos(String isbn, int id) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(id);
        if (livro != null || usuario != null) {
            if (livro.isDisponivel() && usuario.podePegarMaisLivros()) {
                livro.emprestar();
                usuario.adicionarLivro(livro);
                System.out.println("Emprestimo realizado com sucesso!");
            } else {
                System.out.println("Emprestimo não pode ser realizado!");
            }
        } else {
            System.out.println("Usuario e Livro não encontrado:");
        }
    }
    public void realizarDevolucao(String isbn, int id) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(id);
        if (livro == null || usuario == null) {
            System.out.println("Livro e Usuario  não encontrado!");
            return;
        }
        if (!usuario.getLivrosEmprestados().contains(livro)) {
            System.out.println("O usuário não possui este livro emprestado.");
            return;
        }
        usuario.removerLivro(livro);
        livro.devolver();
        System.out.println("Devolucao realizada com sucesso!");
    }


    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livro.exibirDetlhes();
            }
        }
    }
}

