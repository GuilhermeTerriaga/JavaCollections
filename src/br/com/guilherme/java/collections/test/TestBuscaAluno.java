package br.com.guilherme.java.collections.test;

import br.com.guilherme.java.collections.models.Aluno;
import br.com.guilherme.java.collections.models.Aula;
import br.com.guilherme.java.collections.models.Cursos;

public class TestBuscaAluno {
    public static void main(String[] args) {
        Cursos cursoJavaCollections = new Cursos("coleções do java!", "instrutor");

        cursoJavaCollections.adiciona(new Aula("titulo2", 31));
        cursoJavaCollections.adiciona(new Aula("titulo1", 32));
        cursoJavaCollections.adiciona(new Aula("titulo3", 33));

        Aluno a1 = new Aluno(1234, "nome1");
        Aluno a2 = new Aluno(12345, "nome12");
        Aluno a3 = new Aluno(123456, "nome123");
        Aluno a4 = new Aluno(1234567, "nome1234");

        cursoJavaCollections.matricula(a1);
        cursoJavaCollections.matricula(a2);
        cursoJavaCollections.matricula(a3);
        cursoJavaCollections.matricula(a4);

        System.out.println("Todos os alunos do curso: ");
        cursoJavaCollections.getAlunos().forEach(aluno -> System.out.println(aluno));
        System.out.println("__________________________________");
        System.out.println("Aluno de matricula 1234 está matriculado?");
        Aluno aluno = cursoJavaCollections.buscaMatricula(1234);
        System.out.println(aluno);
        System.out.println("__________________________________");
        cursoJavaCollections.iteraSobreMap();
    }
}
