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
}
