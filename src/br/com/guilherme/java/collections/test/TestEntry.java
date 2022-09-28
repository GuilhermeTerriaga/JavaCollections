package br.com.guilherme.java.collections.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestEntry {
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.forEach((k, v) -> System.out.println(k));
        nomesParaIdade.forEach((k, v) -> System.out.println(v));
        Set<Entry<String, Integer>> entry = nomesParaIdade.entrySet();
        entry.forEach(entrada -> System.out.println(entrada));
    }
}
