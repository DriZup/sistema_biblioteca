package SistemaBiblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public String getIsbn() {
        return isbn;
    }

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public void exibirDetlhes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Disponível: " + disponivel);
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

}
