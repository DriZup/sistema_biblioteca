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

    public boolean realizarEmprestimos(String isbn, int id) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn) && livro.isDisponivel()) {
                for (Usuario usuario : usuarios) {
                    if (usuario.getId() == id) {
                        livro.setDisponivel(false);
                        usuario.adicionarLivro(livro);
                        System.out.println("Empréstimo realizado com sucesso!");
                        return true;
                    }
                }
                System.out.println("Usuário não encontrado.");
                return false;
            }
        }
        System.out.println("Livro não encontrado ou não está disponível.");
        return false;
    }
}

