package br.com.guilherme.java.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import br.com.guilherme.java.collections.models.Aula;
import br.com.guilherme.java.collections.models.Cursos;

public class TestCurso {

    public static void main(String[] args) {
        Cursos cursoJavaCollections = new Cursos("coleções do java!", "instrutor");


        cursoJavaCollections.adiciona(new Aula("titulo2", 31));
        cursoJavaCollections.adiciona(new Aula("titulo1", 32));
        cursoJavaCollections.adiciona(new Aula("titulo3", 33));
        cursoJavaCollections.adiciona(new Aula("titulo6", 33));
        cursoJavaCollections.adiciona(new Aula("titulo5", 33));
        cursoJavaCollections.adiciona(new Aula("titulo4", 33));
        System.out.println(cursoJavaCollections.getAulas());

        List<Aula> aulas = new ArrayList<>(cursoJavaCollections.getAulas());
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(cursoJavaCollections.getTempoTotal());
        System.out.println("----------------------------------------------------------");
        System.out.println(cursoJavaCollections);
    }
}
