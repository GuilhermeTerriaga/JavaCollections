package br.com.guilherme.java.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import br.com.guilherme.java.collections.models.Aula;

public class TestListaDeAula {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Revisitando Arrays", 21);
        Aula aula2 = new Aula("Listas de objetos", 30);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("-------------------------------------------------");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println("Aulas por ordenação de tempo: " + aulas);

        System.out.println("-------------------------------------------------");
        System.out.println(aulas);

        System.out.println("-------------------------------------------------");
        Collections.sort(aulas);
        System.out.println("Aulas por ordenação de titulo: " + aulas);


        System.out.println("-------------------------------------------------");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println("Aulas por ordenação de tempo: " + aulas);
    }
}
