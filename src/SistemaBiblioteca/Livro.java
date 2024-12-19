package SistemaBiblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public void exibirDetlhes() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(isbn);
        System.out.println(disponivel);
    }

    public void emprestar() {
        disponivel = true;
    }

    public void devolver() {
        disponivel = false;
    }

    public Object getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
