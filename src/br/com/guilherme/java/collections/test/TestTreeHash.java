package br.com.guilherme.java.collections.test;

import java.util.Set;
import java.util.TreeSet;
import br.com.guilherme.java.collections.models.Recibo;

public class TestTreeHash {
    public static void main(String[] args) {
        Recibo recibo1 = new Recibo(12);
        Recibo recibo2 = new Recibo(2);
        Recibo recibo3 = new Recibo(33);
        Set<Recibo> set = new TreeSet<>();
        set.add(recibo1);
        set.add(recibo2);
        set.add(recibo3);
        set.forEach(recibo -> System.out.println(recibo));


    }
}
