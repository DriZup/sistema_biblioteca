package SistemaBiblioteca;

import java.util.ArrayList;

public class Usuario  {


    private int id;
    private String nome;
    private ArrayList<Livro>livrosEmprestados;



    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void exibirDetalhe(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
    }

    public  void adicionarLivro(Livro livro){
        this.livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro){
        this.livrosEmprestados.remove(livro);
    }
}
