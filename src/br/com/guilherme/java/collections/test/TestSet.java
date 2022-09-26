package br.com.guilherme.java.collections.test;

import java.util.Collection;
import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("teste");
        alunos.add("teste1");
        alunos.add("teste2");
        alunos.add("teste3");
        alunos.add("teste4");
        alunos.add("teste5");

        boolean matriculado = alunos.contains("teste5");
        System.out.println(matriculado);
        System.out.println(alunos);
    }
}
