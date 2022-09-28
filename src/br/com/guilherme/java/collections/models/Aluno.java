package br.com.guilherme.java.collections.models;

public class Aluno {
    private int numeroMatricula;
    private String nome;

    public Aluno(int numeroMatricula, String nome) {
        if (nome == null) {
            throw new NullPointerException("nome não pode ser nulo");
        }
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno de nome: " + nome + ", numeroMatricula: " + numeroMatricula;
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.getNome());
    }



}
