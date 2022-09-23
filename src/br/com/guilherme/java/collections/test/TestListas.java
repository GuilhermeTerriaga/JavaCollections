package br.com.guilherme.java.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListas {
    public static void main(String[] args) throws Exception {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        List<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(aula1);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("aula : " + aula);
        }

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> System.out.println("aula : " + aula));

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        aulas.add("Aula");
        System.out.println("antes da ordenacao " + aulas);
        Collections.sort(aulas);

        System.out.println("depois da ordenacao " + aulas);

    }
}
