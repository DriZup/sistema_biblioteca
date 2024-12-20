package SistemaBiblioteca;

import java.util.ArrayList;

public   class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimos(String isbn, int id) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(id);
        if (livro != null && usuario != null) {
            if (livro.isDisponivel() && usuario.podePegarMaisLivros()) {
                livro.emprestar();
                usuario.adicionarLivro(livro);
                System.out.println("Emprestado com sucesso!");
            } else {
                System.out.println("Emprestimo não realizado!");
            }
        } else {
            System.out.println("Usuario não cadastrado!");
        }
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }return null;
    }

    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }return null;
    }
}

