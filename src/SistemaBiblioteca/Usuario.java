package SistemaBiblioteca;

import java.util.ArrayList;

public class Usuario  {


    private int id;
    private String nome;
    ArrayList<Livro>livrosEmprestados;



    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + ", ID: " + id + ", Livros emprestados: " + livrosEmprestados.size());
    }

    public  void adicionarLivro(Livro livro){
        this.livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro){
        this.livrosEmprestados.remove(livro);
    }

    public boolean podePegarMaisLivros() {
        return livrosEmprestados.size() < 3;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
