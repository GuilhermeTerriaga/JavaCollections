package br.com.guilherme.java.collections.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cursos {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private int tempoTotal;

    public Cursos(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
        this.tempoTotal += aula.getTempo();

    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso, aulas:" + aulas + ", instrutor:" + instrutor + ", nome:" + nome
                + ", tempoTotal:" + tempoTotal + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }


}
