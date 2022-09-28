package br.com.guilherme.java.collections.test;

import br.com.guilherme.java.collections.models.Aluno;
import br.com.guilherme.java.collections.models.Aula;
import br.com.guilherme.java.collections.models.Cursos;

public class TestCursoAluno {
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
        System.out.println("Este a1 está matriculado?");
        System.out.println(cursoJavaCollections.estaMatriculado(a1));
        System.out
                .println("E este aluno com os mesmos atributos que o anterior, está matriculado?");
        // usa o equals da classe Aluno para vallidar
        System.out.println(cursoJavaCollections.estaMatriculado(new Aluno(1234, "nome1")));
        System.out.println(a1.hashCode() == new Aluno(1234, "nome1").hashCode());

    }
}
